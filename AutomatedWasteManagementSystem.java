public class AutomatedWasteManagementSystem {
    public static void main(String[] args) {

        WasteCollector organicCollector = new OrganicWasteCollector();
        WasteCollector recyclableCollector = new RecyclableWasteCollector();
        WasteCollector hazardousCollector = new HazardousWasteCollector();

        organicCollector.setNext(recyclableCollector);
        recyclableCollector.setNext(hazardousCollector);

        WasteContainer container1 = new WasteContainer(500, "organic");
        WasteContainer container2 = new WasteContainer(300, "recyclable");
        WasteContainer container3 = new WasteContainer(200, "hazardous");

        System.out.println("Processing container1:");
        organicCollector.collectWaste(container1);

        System.out.println("\nProcessing container2:");
        organicCollector.collectWaste(container2);

        System.out.println("\nProcessing container3:");
        organicCollector.collectWaste(container3);
    }
}
