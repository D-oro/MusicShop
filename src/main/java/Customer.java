import java.util.ArrayList;
public class Customer {
    private String name;
    private String customerNumber;
    private ArrayList<StockItem> basket;

    public Customer(String name, String customerNumber){
        this.name = name;
        this.customerNumber = customerNumber;
        this.basket = new ArrayList<StockItem>();
    }

    public ArrayList<StockItem> getBasket() {
        return basket;
    }

    public String getBasketAsString(){
        String basketItems = "items in basket: ";
        for (StockItem item : basket){
            basketItems += (item.getItemName() + ", ");
        }
        return basketItems;
    }

    public void addItemToBasket(StockItem item){
        basket.add(item);
    }
    public void removeItemFromBasket(StockItem item){
        basket.remove(item);
    }
    public int getSizeOfBasket(){
        return basket.size();
    }

    public String getName() {
        return name;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setName(String name) {
        this.name = name;
    }
}
