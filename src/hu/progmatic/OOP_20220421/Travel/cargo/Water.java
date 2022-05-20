package hu.progmatic.OOP_20220421.Travel.cargo;

public class Water {
    private double volume;
    private double unitPrice;


    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getUnitPrice() {
    // Ha nincsen unitPrice nevű paraméter,
    // akkor this.unitPrice azonos a unitPrice-al
        return this.unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
    // Ha van unitPrice nevű paraméter,
    // akkor
    // this.unitPrice a mezőt (osztályhoz tartozó memóriaterület) azonosítja
    // unitPrice pedig a paramétert
        this.unitPrice = unitPrice;
    }

    public double getPrice() {
        return volume * unitPrice;
    }


}
