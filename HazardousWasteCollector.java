public class HazardousWasteCollector implements WasteCollector {
    private WasteCollector nextCollector;

    @Override
    public void setNext(WasteCollector nextCollector) {
        this.nextCollector = nextCollector;
    }

    @Override
    public void collectWaste(WasteContainer container) {
        if ("hazardous".equalsIgnoreCase(container.getType())) {
            System.out.println("Collecting hazardous waste with capacity " + container.getCapacity());

        } else if (nextCollector != null) {
            nextCollector.collectWaste(container);
        }
    }
}
