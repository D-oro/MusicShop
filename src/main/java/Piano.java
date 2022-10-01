public class Piano extends Instrument implements IPlay{

    private String manufacturer;

    public Piano(double acquisitionPrice, double sellingPrice, String colour, String material, String type, String manufacturer) {
        super(acquisitionPrice, sellingPrice, colour, material, type);
        this.manufacturer = manufacturer;
    }

    public String play(){
        return "I'm playing the piano!";
    }
}
