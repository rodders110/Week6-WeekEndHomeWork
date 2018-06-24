import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList<Guest> guests;
    private Guest answer;


    public Room(int capacity) {
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
    }

    public int getCapacity() {
        return capacity;
    }



    public ArrayList<Guest> getGuests() {
        return guests;
    }


    public void checkIn(Guest guest){
        if (capacity > guests.size()){
            guests.add(guest);
        }
    }

    public void checkOut(Guest guest){
        if (guests.contains(guest)){
            guests.remove(guest);
        }
    }

    public Guest getGuest(String name){
        for(Guest person : guests){
            if(person.getName().equals(name)){
                answer = person;
            }
        }
        return answer;
    }
}
