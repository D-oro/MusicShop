import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;

    Piano piano;

    SheetMusic sheetmusic;

    HowToManual howtomanual;

    @Before
    public void before(){
        shop = new Shop();
        howtomanual = new HowToManual(4, 20, "beginner");
        sheetmusic = new SheetMusic(3, 10, "Beethoven", "Moonlight Sonata");
        piano = new Piano(5000,7000, "black", "wood", Type.PERCUSSION, Type.STRING,"Yamaha" );
        guitar = new Guitar(300,500, "brown", "wood", Type.STRING, "western");
    }
    // 16 + 7 + 2000 + 200 = 2223
    @Test
    public void canGetTotalPotentialProfit(){
        shop.addItemToStock(guitar);
        shop.addItemToStock(piano);
        shop.addItemToStock(howtomanual);
        shop.addItemToStock(sheetmusic);
        assertEquals(2223, shop.getTotalPotentialProfit(), 1e-3);

    }

    @Test
    public void stockStartsAtZero(){
        assertEquals(0, shop.getNumberOfItemsInStock());
    }

    @Test
    public void canAddItemsToStock(){
        shop.addItemToStock(guitar);
        assertEquals(1, shop.getNumberOfItemsInStock());
    }

    @Test
    public void canRemoveItemsFromStock(){
        shop.addItemToStock(guitar);
        shop.addItemToStock(guitar);
        shop.addItemToStock(guitar);
        shop.removeItemFromStock(guitar);
        assertEquals(2, shop.getNumberOfItemsInStock());
    }

}
