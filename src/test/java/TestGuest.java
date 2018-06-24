import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGuest {

    private Guest guest;

    @Before
    public void before(){
        guest = new Guest("Roddy");
    }

    @Test
    public void testCanGetName() {
        assertEquals("Roddy", guest.getName());
    }
}
