package hu.progmatic.OOP_20220413;

public class ShipContainer {
    // Hajózási konténer
    public String type;
    public String color;
    public int size;
    public boolean isUsed;  // a default érték false

    // default konstruktor
    public ShipContainer() {

    }

    public ShipContainer(String type, String color, int size, boolean isUsed) {
        this.type = type;
        this.color = color;
        this.size = size;
        this.isUsed = isUsed;
    }


    public ShipContainer(boolean isUsed) {
        this.isUsed = isUsed;
    }

    public ShipContainer(int size) {
        this.size = size;
    }

    public ShipContainer(int size, boolean isUsed) {
        this.size = size;
        this.isUsed = isUsed;
    }

}
