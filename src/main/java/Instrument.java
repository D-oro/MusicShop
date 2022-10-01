public class Instrument extends StockItem implements ISell, IPlay{
    private String colour;
    private String material;
    private String type;

    public Instrument(double acquisitionPrice, double sellingPrice) {
        super(acquisitionPrice, sellingPrice);
        this.colour = colour;
        this.material = material;
        this.type = type;
    }

    public double calculateMarkup(Instrument instrument) {

        return instrument.getSellingPrice() - instrument.getAcquisitionPrice();
    }

    public String play(Instrument instrument){
        return "Woohoo I'm playing the " + instrument;
    }
}
