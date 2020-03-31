import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecordDeckTest {

    RecordDeck recordDeck;

    @Before
    public void before() {
        recordDeck = new RecordDeck("Sony", "33", 45);
    }

    @Test
    public void hasSpeed() {
        assertEquals(45, recordDeck.getSpeed());
    }

    @Test
    public void hasMake() {
        assertEquals("Sony", recordDeck.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("33", recordDeck.getModel());
    }

}
