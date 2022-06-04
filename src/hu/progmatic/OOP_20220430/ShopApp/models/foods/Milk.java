package hu.progmatic.OOP_20220430.ShopApp.models.foods;

import hu.progmatic.OOP_20220430.ShopApp.models.UnitType;

public class Milk extends Drink {

    private double fat;

    public Milk() {
        super(1.0, UnitType.LITER, false, 50);
        this.fat = 1.5;
    }

    public Milk(double quantity, int price) {
        super(quantity, UnitType.LITER, price);
        this.fat = 1.5;
    }

    public Milk(double quantity, UnitType unitType, boolean isLongLife, int price, double fat) {
        super(quantity, unitType, isLongLife, price);
        this.fat = fat;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

}
