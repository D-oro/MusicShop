public class Guitar extends Instrument implements IPlay {

    private String subtype;

    public Guitar (String itemName, double acquisitionPrice, double sellingPrice,String colour, String material, Type type, String subtype) {
        super(itemName, acquisitionPrice, sellingPrice, colour, material, type);
        this.subtype = subtype;
    }


    public String play(){
        return "I'm playing the guitar!";
    }
}
