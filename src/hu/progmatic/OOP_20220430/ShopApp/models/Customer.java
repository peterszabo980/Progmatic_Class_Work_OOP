package hu.progmatic.OOP_20220430.ShopApp.models;

import hu.progmatic.OOP_20220430.ShopApp.models.foods.Milk;
import hu.progmatic.OOP_20220430.ShopApp.models.foods.Product;

import java.util.Arrays;
import java.util.Objects;

public class Customer {

    private String name;
    private int money;
    private Product[] cart;
    //private boolean isAdult;

    public Customer(String name) {
        this(name, 5000, 10);
    }

    public Customer(String name, int money, int cartSize) {
        this.name = name;
        this.money = money;
        this.cart = new Product[cartSize];
    }

    public void buyMilk(Product[] products, double maxFatPercent) {
        Milk milk = findMilk(products, maxFatPercent);

        if (milk != null) {
            boolean buy = couldPutIntoCart(milk);
        }
    }

    public Milk findMilk(Product[] products, double maxFatPercent) {
        for (Product product : products) {
            // itt még nem tudom, hogy ez Milk-e
            if (product instanceof Milk productMilk
                    && productMilk.getFat() < maxFatPercent) {
                return productMilk;
            }
        }

        return null;
    }

    /*public boolean containsMilk(Product[] products) {
        for (Product product : products) {
            if (product instanceof Milk) {
                return true;
            }
        }

        return false;
    }*/

    public boolean couldPutIntoCart(Product toBuy) {
        int nextCartIndex = findNextFreeCartSpot();

        if (nextCartIndex < cart.length) {
            cart[nextCartIndex] = toBuy;
            return true;
        }

        return false;
    }

    private int findNextFreeCartSpot() {
        int i = 0;

        while (i < cart.length && cart[i] != null) {
            i++;
        }

        return i;
    }

    public void payTheBill(int bill) {
        money -= bill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Product[] getCart() {
        return cart;
    }

    public void setCart(Product[] cart) {
        this.cart = cart;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || !this.getClass().equals(o.getClass())) {
            return false;
        }

        Customer customer = (Customer) o;

        return money == customer.money && name.equals(customer.name)
                && Arrays.equals(cart, customer.cart);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, money);
        result = 31 * result + Arrays.hashCode(cart);
        return result;
    }

}
