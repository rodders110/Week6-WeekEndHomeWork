public class Bedroom extends Room {
    private int roomNumber;
    private RoomType type;
    private double rate;

    public Bedroom(int roomNumber, RoomType type) {
        super(type.getValue());
        this.roomNumber = roomNumber;
        this.type = type;
        this.rate = (this.type.getValue()) * 50.75;

    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getType() {
        return type.getName();
    }

    public double getRate() {
        return rate;
    }


}
