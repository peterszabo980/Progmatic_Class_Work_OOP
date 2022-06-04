package hu.progmatic.OOP_20220430.ShopApp;

import hu.progmatic.OOP_20220430.ShopApp.models.UnitType;
import hu.progmatic.OOP_20220430.ShopApp.models.foods.Bread;
import hu.progmatic.OOP_20220430.ShopApp.models.foods.Milk;
import hu.progmatic.OOP_20220430.ShopApp.models.foods.Product;
import hu.progmatic.OOP_20220430.ShopApp.models.foods.Sugar;

public class Main {

    // valami édes ^^

    public static void main(String[] args) {
        Product tokMindegyMi = new Product(1.0, UnitType.PIECE, 1000);


        Product[] productsFromShop = {
                null,
                new Sugar(),
                new Milk(),
                new Product()
        };

        // 1. lehetőség
        Class[] buyerWishList1 = {};

        // 2. lehetőség
        Product[] buyerWishList2 = {};

        // 3. lehetőség
        String[] buyerWishList3 = {"kenyér", "rum", "tej"};

        String buyerWish = "kenyér";

        Class breadClass = Bread.class;                     // Bread maga az osztály
        
        /*for (Product product : products) {
            if (product instanceof Bread) {
                System.out.println("ez egy kenyér");
            } else  {
                System.out.println("nem kenyér");
            }

            // alább ugyanaz, mint fentebb, csak az instanceof nélkül

            if (product != null) {
                Class productClass = product.getClass();        // product - egy objektum

                if (productClass == (breadClass)) {
                    Bread bread = (Bread) product;
                    System.out.println("ez egy kenyér, a lisztje: " + bread.getFlourType());
                } else {
                    System.out.println("ez nem kenyér");
                }
            } else {
                System.out.println("ez egy null");
            }
        }*/

        /*Customer buyer = new Customer("Név");

        Class cl = buyer.getClass();

        String clClassnameWithPackages = buyer.getClass().getName();  // Customer
        String clClassname = buyer.getClass().getSimpleName();        // Customer

        System.out.println(cl);

        boolean equals = buyer.equals("string");

        Product p = new Bread();
        Bread b = (Bread) p;
        b.getFlourType();

        System.out.println("cast success");*/
    }


    // DRY = DO NOT REPEAT YOURSELF!!!
    // kód leegyszerűsítése, könnyebb kezelhetősége

    // ---------------------

    /*
        élelmiszerek (ősosztály vagy anyaosztály vagy apaosztály):
            kenyér
            alma
            tej
            cukor
            sör
        vásárló:
            vásárló
                private Food[] cart;

     */

}
