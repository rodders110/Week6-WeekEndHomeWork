import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHotel {

    Hotel hotel;
    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    ConferenceRoom conferenceRoom;
    DiningRoom diningRoom;
    Guest guest1;
    Guest guest2;
    Guest guest3;
    Guest guest4;
    Guest guest5;
    Guest guest6;


    @Before
    public void setUp() {
       hotel = new Hotel("California");
       bedroom1 = new Bedroom(1, RoomType.SINGLE);
       bedroom2 = new Bedroom(2, RoomType.DOUBLE);
       bedroom3 = new Bedroom(3, RoomType.FAMILY);
       diningRoom = new DiningRoom("The Blue Dug");
       conferenceRoom = new ConferenceRoom("The Golden Ballroom");
       guest1 = new Guest("Roddy");
       guest2 = new Guest("David");
       guest3 = new Guest("Adri");
       guest4 = new Guest("Derek");
       guest5 = new Guest("Cleyra");
       guest6 = new Guest("John");
       hotel.addRoom(bedroom1);
       hotel.addRoom(bedroom2);
       hotel.addRoom(bedroom3);
       hotel.addRoom(conferenceRoom);
       hotel.addRoom(diningRoom);
    }

    @Test
    public void hasName() {
        assertEquals("California", hotel.getName());
    }

    @Test
    public void hasCollectionOfRooms() {
        assertEquals(5, hotel.getrooms().size());
    }

    @Test
    public void canCheckGuestIntoRoom() {
        hotel.checkin(bedroom1, guest1);
        assertEquals(1, bedroom1.getGuests().size());
    }

    @Test
    public void canCheckOut() {
        hotel.checkOut(bedroom1, guest1);
            assertEquals(0, bedroom1.getGuests().size());
    }

    @Test
    public void canGetGuestsCheckedIn() {
        hotel.checkin(bedroom1, guest1);
        hotel.checkin(bedroom2, guest2);
        hotel.checkin(bedroom2, guest3);
        hotel.checkin(bedroom3, guest4);
        hotel.checkin(bedroom3, guest5);
        hotel.checkin(bedroom3, guest6);

        assertEquals("David, Adri", hotel.checkedIn(bedroom2));

    }
}




