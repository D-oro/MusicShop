public class HowToManual extends StockItem {

    public String difficultyLevel;

    public HowToManual(String itemName, double acquisitionPrice, double sellingPrice, String difficultyLevel) {
        super(itemName, acquisitionPrice, sellingPrice);
        this.difficultyLevel = difficultyLevel;
    }

    public String getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(String difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }
}
