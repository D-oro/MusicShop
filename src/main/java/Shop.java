import java.util.ArrayList;

public class Shop {

    private ArrayList<StockItem> stock;

    public Shop(){
        this.stock = new ArrayList<StockItem>();
    }


    public double getTotalPotentialProfit(){
        double profit = 0;
        for (StockItem item : stock){
            profit = profit + item.calculateMarkup();
        }
        return profit;
    }

    public void addItemToStock(StockItem item){
        stock.add(item);
    }

    public void removeItemFromStock(StockItem item){
        stock.remove(item);
    }

    public int getNumberOfItemsInStock() {
        return stock.size();
    }
}
