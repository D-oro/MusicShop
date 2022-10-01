public abstract class Instrument extends StockItem {
    private String colour;
    private String material;
    private String type;

    public Instrument(double acquisitionPrice, double sellingPrice, String colour, String material, String type) {
        super(acquisitionPrice, sellingPrice);
        this.colour = colour;
        this.material = material;
        this.type = type;
    }
}
