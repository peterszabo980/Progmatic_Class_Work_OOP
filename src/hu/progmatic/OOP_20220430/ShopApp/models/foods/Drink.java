package hu.progmatic.OOP_20220430.ShopApp.models.foods;

import hu.progmatic.OOP_20220430.ShopApp.models.Consumable;
import hu.progmatic.OOP_20220430.ShopApp.models.UnitType;

public class Drink extends Product implements Consumable {

    public Drink(double quantity, UnitType unitType, int price) {
        this.quantity = quantity;
        this.unitType = unitType;
        this.price = price;
    }

    public Drink(double quantity, UnitType unitType, boolean isLongLife, int price) {
        this(quantity, unitType, price);
        this.isLongLife = isLongLife;
    }

    public void sayHello(String name) {
        System.out.println("Welcome");
    }

}
