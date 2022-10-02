import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class SheetMusicTest {

    SheetMusic sheetmusic;

    @Before
    public void before(){
        sheetmusic = new SheetMusic("sheetmusic",3, 10, "Beethoven", "Moonlight Sonata");
    }

    @Test
    public void canGetComposer(){
        assertEquals("Beethoven", sheetmusic.getComposer());
    }

    @Test
    public void canChangeComposer(){
        sheetmusic.setComposer("Ludwig van Beethoven");
        assertEquals("Ludwig van Beethoven", sheetmusic.getComposer());
    }

    @Test
    public void canGetTitle(){
        assertEquals("Moonlight Sonata", sheetmusic.getTitle());
    }

    @Test
    public void canChangeTitle(){
        sheetmusic.setTitle("Piano Sonata No. 14");
        assertEquals("Piano Sonata No. 14", sheetmusic.getTitle());
    }


}
