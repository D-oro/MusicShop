public class SheetMusic extends StockItem{

    private String composer;
    private String title;

    public SheetMusic(String itemName, int acquisitionPrice, int sellingPrice, String composer, String title){
        super(itemName, acquisitionPrice, sellingPrice);
        this.composer = composer;
        this.title = title;
    }

    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
