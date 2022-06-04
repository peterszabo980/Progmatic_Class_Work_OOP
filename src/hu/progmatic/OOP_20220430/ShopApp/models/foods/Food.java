package hu.progmatic.OOP_20220430.ShopApp.models.foods;

import hu.progmatic.OOP_20220430.ShopApp.models.Consumable;
import hu.progmatic.OOP_20220430.ShopApp.models.UnitType;

public class Food extends Product implements Consumable {

    public Food(double quantity, UnitType unitType, int price) {
        this.quantity = quantity;
        this.unitType = unitType;
        this.price = price;
    }

    // konstruktor
    public Food(double quantity, UnitType unitType, boolean isLongLife, int price) {
        this(quantity, unitType, price);
        this.isLongLife = isLongLife;
    }
}
