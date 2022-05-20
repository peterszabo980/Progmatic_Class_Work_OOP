package hu.progmatic.OOP_20220421.Travel.cargo;

public class WaterOlda {
    private double volume;
    private double unitPrice;
    private double price;

    public  double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
        this.price = this.volume * this.unitPrice;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        System.out.println("Az ár megváltozott.");
        this.unitPrice = unitPrice;
        this.price = this.volume * this.unitPrice;

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        // itt lehet nullával való osztás
        //this.unitPrice = this.price / this.volume;
    }
}
