public enum RoomType {

    SINGLE(1, "Single"),
    DOUBLE(2, "Double"),
    SUITE(2, "Suite"),
    FAMILY(4, "Family"),
    CONFERENCE(30, "Conference"),
    DININGROOM(25, "Dining Room");

    private final int value;
    private final String name;



    RoomType(int value, String name) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
}
