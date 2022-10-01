import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano(5000,7000, "black", "wood", Type.PERCUSSION, Type.STRING,"Yamaha" );
    }

    @Test
    public void canChangeSellingPrice(){
        piano.setSellingPrice(6500);
        assertEquals(6500, piano.getSellingPrice(), 1e-3);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(2000, piano.calculateMarkup(), 1e-3);
    }

    @Test
    public void canGetBothTypesAsString(){
        assertEquals("string, percussion", piano.getBothTypesAsString());
    }

}


