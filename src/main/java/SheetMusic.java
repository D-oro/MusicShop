public class SheetMusic extends StockItem{

    private String composer;
    private String title;

    public SheetMusic(int acquisitionPrice, int sellingPrice, String composer, String title){
        super(acquisitionPrice, sellingPrice);
        this.composer = composer;
        this.title = title;
    }


}
