public abstract class StockItem {
    private double acquisitionPrice;
    private double sellingPrice;

    public StockItem(double acquisitionPrice, double sellingPrice){
        this.acquisitionPrice = acquisitionPrice;
        this.sellingPrice = sellingPrice;
    }

    public double getAcquisitionPrice() {
        return acquisitionPrice;
    }

    public void setAcquisitionPrice(double acquisitionPrice) {
        this.acquisitionPrice = acquisitionPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }
}
