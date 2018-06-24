import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDiningRoom {
    DiningRoom diningRoom;
    Guest guest1;
    Guest guest2;

    @Before
    public void setUp() {
        diningRoom = new DiningRoom("The Blue Dug");
        guest1 = new Guest("Roddy");
        guest2 = new Guest("David");
        diningRoom.checkIn(guest1);
        diningRoom.checkIn(guest2);
    }

    @Test
    public void hasType() {
        assertEquals("Dining Room", diningRoom.getType());
    }

    @Test
    public void hasCapacity() {
        assertEquals(25, diningRoom.getCapacity());
    }

    @Test
    public void hasName() {
        assertEquals("The Blue Dug", diningRoom.getName());
    }

    @Test
    public void hasGetGuestList() {
        assertEquals(2, diningRoom.getGuests().size());
    }
}
