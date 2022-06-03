package hu.progmatic.OOP_20220427.shop;

public class Food extends Product {

    public Food(double quantity, String untiType, int price) {
        this.quantity = quantity;
        this.untiType = untiType;
        this.price = price;
    }

    public Food (double quantity, String untiType, boolean isLongLife, int price) {
        this(quantity, untiType, price);
        this.isLongLife = isLongLife;
    }
}
