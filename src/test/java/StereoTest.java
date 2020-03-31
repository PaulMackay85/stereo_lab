import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoTest {

    Stereo stereo;
    RecordDeck recordDeck;
    Radio radio;
    CDPlayer cdPlayer;

    @Before
    public void before() {
        recordDeck = new RecordDeck("Sony", "33", 45);
        radio = new Radio("RadioZZ", "Super", "CodeClan Radio");
        cdPlayer = new CDPlayer("Panasonic", "Ultra", 10);
        stereo = new Stereo(recordDeck, radio, cdPlayer);
    }

    @Test
    public void hasRadioStation(){
        assertEquals("CodeClan Radio", stereo.getRadio().tune());
    }

    @Test
    public void hasCDPlayerModel(){
        assertEquals("Ultra", stereo.getCdPlayer().getModel());
    }

    @Test
    public void hasRecordDeckSpeed(){
        assertEquals(45, stereo.getRecordDeck().getSpeed());
    }

    @Test
    public void canRaiseVolume() {
        stereo.raiseVolume();
        assertEquals(10, stereo.getVolume());
    }

    @Test
    public void canLowerVolume() {
        stereo.raiseVolume();
        stereo.raiseVolume();
        stereo.lowerVolume();
        assertEquals(10, stereo.getVolume());
    }

    @Test
    public void canChangeRadioStation() {
        stereo.changeRadioStation("Radio 4");
        assertEquals("Radio 4", stereo.getRadio().tune());
    }
}
