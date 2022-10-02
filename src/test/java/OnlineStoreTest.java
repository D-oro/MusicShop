import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class OnlineStoreTest {

    OnlineStore onlineStore;

    HowToManual howtomanual;

    SheetMusic sheetmusic;
    Piano piano;
    Guitar guitar;
    Customer customer1;
    Customer customer2;
    Customer customer3;

    @Before
    public void before(){
        onlineStore = new OnlineStore();
        customer1 = new Customer("Elsbeth Tascioni", "12345");
        customer2 = new Customer("Elsbeth Tascioni", "02468");
        customer3 = new Customer("Michelle Obama", "54321");
        howtomanual = new HowToManual("howtomanual",4, 20, "beginner");
        sheetmusic = new SheetMusic("sheetmusic", 3, 10, "Beethoven", "Moonlight Sonata");
        piano = new Piano("piano", 5000,7000, "black", "wood", Type.PERCUSSION, Type.STRING,"Yamaha" );
        guitar = new Guitar("guitar", 300,500, "brown", "wood", Type.STRING, "western");
    }



    @Test
    public void canFindNumberByCustomerName(){
        onlineStore.addCustomerToCustomerList(customer1);
        onlineStore.addCustomerToCustomerList(customer2);
        onlineStore.addCustomerToCustomerList(customer3);
        assertEquals("[12345, 02468]" , onlineStore.findCustomerNumberByName("Elsbeth Tascioni"));
    }
}
