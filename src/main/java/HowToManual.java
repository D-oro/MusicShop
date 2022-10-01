public class HowToManual extends StockItem {

    public String difficultyLevel;

    public HowToManual(double acquisitionPrice, double sellingPrice, String difficultyLevel) {
        super(acquisitionPrice, sellingPrice);
        this.difficultyLevel = difficultyLevel;
    }
}
