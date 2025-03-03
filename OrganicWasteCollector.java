public class OrganicWasteCollector implements WasteCollector {
    private WasteCollector nextCollector;

    @Override
    public void setNext(WasteCollector nextCollector) {
        this.nextCollector = nextCollector;
    }

    @Override
    public void collectWaste(WasteContainer container) {
        if ("organic".equalsIgnoreCase(container.getType())) {
            System.out.println("Collecting organic waste with capacity " + container.getCapacity());
       
        } else if (nextCollector != null) {
            nextCollector.collectWaste(container);
        }
    }
}
