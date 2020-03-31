import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;

    @Before
    public void before(){
        radio = new Radio("Toshiba", "XR564", "Station CodeClan");
    }
    
    @Test
    public void setRadioStation(){
        assertEquals("Station CodeClan", radio.tune());
    }

    @Test
    public void hasMake() {
        assertEquals("Toshiba", radio.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("XR564", radio.getModel());
    }

    @Test
    public void canSetRadioStation() {
        radio.setStation("Radio 1");
        assertEquals("Radio 1", radio.tune());
    }
}
