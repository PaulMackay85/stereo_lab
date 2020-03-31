import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CDPlayerTest {

    CDPlayer cdPlayer;

    @Before
    public void before(){
        cdPlayer = new CDPlayer("Panasonic", "Ultra", 10);
    }
    
    @Test
    public void canGetNumberOfCDs(){
        assertEquals(10, cdPlayer.getNumberOfCDs());
    }

    @Test
    public void hasMake() {
        assertEquals("Panasonic", cdPlayer.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("Ultra", cdPlayer.getModel());
    }
}
