public class ConferenceRoom extends Room {

    private String roomName;
    private RoomType type;
    private Double rate;

    public ConferenceRoom(String roomName) {
        super(RoomType.CONFERENCE.getValue());
        this.roomName = roomName;
        this.type = RoomType.CONFERENCE;
        this.rate = 400.00;
    }

    public String getRoomName() {
        return roomName;
    }

    public String getType() {
        return type.getName();
    }

    public Double getRate() {
        return rate;
    }
}
