import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HowToManualTest {

    HowToManual howtomanual;

    @Before
    public void before(){
        howtomanual = new HowToManual("howtomanual", 4, 20, "beginner");
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(16, howtomanual.calculateMarkup(),1e-3);
    }

    @Test
    public void canGetDifficultyLevel(){
        assertEquals("beginner", howtomanual.getDifficultyLevel());
    }

    @Test
    public void canSetDifficultyLevel(){
        howtomanual.setDifficultyLevel("advanced");
        assertEquals("advanced", howtomanual.getDifficultyLevel());
    }


}
