import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano(5000,7000, "black", "wood", "string instrument", "Yamaha" );
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(2000, piano.calculateMarkup(), 1e-3 );
    }




}


