import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestConferenceRoom {
    
    ConferenceRoom conferenceRoom;
    Guest guest1;
    Guest guest2;
    
    @Before
    public void Before(){
        conferenceRoom = new ConferenceRoom("Livingston Room");
        guest1 = new Guest("David");
        guest2 = new Guest("William");
        conferenceRoom.checkIn(guest1);
        conferenceRoom.checkIn(guest2);
    }

    @Test
    public void testCanGetCapacity() {
        assertEquals(30, conferenceRoom.getCapacity());
    }

    @Test
    public void canGetGuestList() {
        assertEquals(2, conferenceRoom.getGuests().size());
    }

    @Test
    public void canGetName() {
        assertEquals("Livingston Room", conferenceRoom.getRoomName());
    }

    @Test
    public void canGetRate() {
        assertEquals(400.00, conferenceRoom.getRate(), 0.01);
    }

    @Test
    public void canGetRoomType() {
        assertEquals("Conference", conferenceRoom.getType());
    }


}
