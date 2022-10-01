public abstract class Instrument extends StockItem {
    private String colour;
    private String material;
    private Type type;

    public Instrument(double acquisitionPrice, double sellingPrice, String colour, String material, Type type) {
        super(acquisitionPrice, sellingPrice);
        this.colour = colour;
        this.material = material;
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public String getTypeAsString() {
        return getType().toString().toLowerCase();
    }
}
