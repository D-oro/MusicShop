public class Piano extends Instrument implements IPlay{

    private String manufacturer;
    private Type typeTwo;

    public Piano(double acquisitionPrice, double sellingPrice, String colour, String material, Type type, Type typeTwo, String manufacturer) {
        super(acquisitionPrice, sellingPrice, colour, material, type);
        this.typeTwo = typeTwo;
        this.manufacturer = manufacturer;
    }

    public Type getTypeTwo() {
        return typeTwo;
    }

    public String getTypeTwoAsString() {
        return (getTypeTwo().toString().toLowerCase());
    }

    public String getBothTypesAsString(){
        return (getTypeTwoAsString() +", "+ getTypeAsString());
    }

    public String play(){
        return "I'm playing the piano!";
    }


}
