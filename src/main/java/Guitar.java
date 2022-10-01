public class Guitar extends Instrument implements IPlay {

    private String subtype;

    public Guitar (double acquisitionPrice, double sellingPrice,String colour, String material, String type, String subtype) {
        super(acquisitionPrice, sellingPrice, colour, material, type);
        this.subtype = subtype;
    }


    public String play(){
        return "I'm playing the guitar!";
    }
}
