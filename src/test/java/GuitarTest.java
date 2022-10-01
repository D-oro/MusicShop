import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

        Guitar guitar;

        @Before
        public void before(){
            guitar = new Guitar(300,500, "brown", "wood", "string instrument", "western");
        }

        @Test
        public void canCalculateMarkup(){
            assertEquals(200, guitar.calculateMarkup(), 1e-3 );
        }

        @Test
        public void canPlay(){
            assertEquals("I'm playing the guitar!", guitar.play());
        }

    }


