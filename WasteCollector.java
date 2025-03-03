public interface WasteCollector {
    void setNext(WasteCollector nextCollector);
    void collectWaste(WasteContainer container);
}
