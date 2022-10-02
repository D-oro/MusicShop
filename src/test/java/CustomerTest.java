import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;

    HowToManual howtomanual;

    SheetMusic sheetmusic;
    Piano piano;

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("guitar", 300,500, "brown", "wood", Type.STRING, "western");
        customer = new Customer("Elsbeth Tascioni", "12345");
        howtomanual = new HowToManual("howtomanual", 4, 20, "beginner");
        sheetmusic = new SheetMusic("sheetmusic",3, 10, "Beethoven", "Moonlight Sonata");
        piano = new Piano("piano", 5000,7000, "black", "wood", Type.PERCUSSION, Type.STRING,"Yamaha" );

    }

    @Test
    public void getBasketAsString(){
        customer.addItemToBasket(guitar);
        customer.addItemToBasket(sheetmusic);
        customer.addItemToBasket(piano);
        customer.addItemToBasket(piano);
        assertEquals("items in basket: guitar, sheetmusic, piano, piano, ", customer.getBasketAsString());
    }

    @Test
    public void customerHasNumber(){
        assertEquals("12345", customer.getCustomerNumber());
    }

    @Test
    public void customerHasName(){
        assertEquals("Elsbeth Tascioni", customer.getName());
    }

    @Test
    public void canAddItemsToBasket(){
        customer.addItemToBasket(guitar);
        assertEquals(1, customer.getSizeOfBasket());
    }

    @Test
    public void canRemoveItemsFromBasket(){
        customer.addItemToBasket(guitar);
        customer.addItemToBasket(guitar);
        customer.removeItemFromBasket(guitar);
        assertEquals(1, customer.getSizeOfBasket());
    }
}
