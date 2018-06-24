import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBedroom {

    private Bedroom bedroom;
    private Bedroom bedroom2;
    private Guest guest;
    private Guest guest2;
    

    @Before
    public void setUp() {
        bedroom = new Bedroom(1, RoomType.SINGLE);
        bedroom2 = new Bedroom(2, RoomType.DOUBLE);
        guest = new Guest("Roddy");
        guest2 = new Guest("Adri");
    }

    @Test
    public void testCanGetRoomNumber() {
        assertEquals(1, bedroom.getRoomNumber());
    }

    @Test
    public void hasCapacity() {
        assertEquals(1, bedroom.getCapacity());
    }

    @Test
    public void canTakeGuest() {
        bedroom.checkIn(guest);
        assertEquals(1, bedroom.getGuests().size());
        assertEquals("Roddy", bedroom.getGuests().get(0).getName());
    }

    @Test
    public void canGetRoomType() {
        assertEquals("Single", bedroom.getType());
    }

    @Test
    public void cannotTakeAnotherGuest() {
        bedroom.checkIn(guest);
        bedroom.checkIn(guest2);
        assertEquals(1, bedroom.getGuests().size());
        assertEquals("Roddy", bedroom.getGuests().get(0).getName());
    }

    @Test
    public void canGetRate() {
        assertEquals(50.75, bedroom.getRate(),0.01);
        assertEquals(101.50, bedroom2.getRate(), 0.01);
    }

    @Test
    public void canCheckout() {
        bedroom.checkIn(guest);
        bedroom.checkOut(bedroom.getGuest("Roddy"));
        assertEquals(0, bedroom.getGuests().size());
    }
}
