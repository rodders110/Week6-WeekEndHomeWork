public class DiningRoom extends Room{
    private String name;
    private RoomType type;

    public DiningRoom(String name) {
        super(RoomType.DININGROOM.getValue());
        this.name = name;
        this.type = RoomType.DININGROOM;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type.getName();
    }
}
