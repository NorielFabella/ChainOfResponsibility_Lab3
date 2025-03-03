public class WasteContainer {
    private int capacity;
    private String type; 

    public WasteContainer(int capacity, String type) {
        this.capacity = capacity;
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }
}
