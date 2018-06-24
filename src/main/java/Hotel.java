import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.BitSet;

public class Hotel {

    private String name;
    private ArrayList<Room> rooms;

    public Hotel(String name) {
        this.name = name;
        this.rooms = new ArrayList<Room>();
    }

    public String getName() {
        return name;
    }

    public ArrayList getrooms() {
        return rooms;
    }

    public void addRoom(Room room) {
        this.rooms.add(room);
    }


    public void checkin(Room room, Guest guest) {
        room.checkIn(guest);
    }

    public void checkOut(Room room, Guest guest) {
        room.checkOut(guest);
    }

    public String checkedIn(Room room) {
        String answer;
        answer = new String();
        for(Guest guest : room.getGuests()){
            answer += guest.getName() + ", ";
        }
        return answer.substring(0, answer.length() -2);
    }

    public String emptyBedRooms() {
        String number;
        number = new String();
        for(Room room : rooms){
            if(room.getCapacity() < 5 && room.getGuests().size() == 0){
                Bedroom bedroom = (Bedroom) room;
                number += bedroom.getRoomNumber() + ", ";
            }
        }
        return number.substring(0, number.length() -2);
    }
}
