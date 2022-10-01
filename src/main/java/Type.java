public enum Type {

    BRASS("brass"),
    STRING("string"),
    WOODWIND("woodwind"),
    PERCUSSION("percussion");

    private String type;

    Type(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
