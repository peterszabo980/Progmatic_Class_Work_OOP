package hu.progmatic.OOP_20220427;

import hu.progmatic.OOP_20220427.shop.Bread;
import hu.progmatic.OOP_20220427.shop.Milk;
import hu.progmatic.OOP_20220427.shop.Product;

public class main {
    public static void main(String[] args) {

        Product kaja = new Product(); // itt van meghívva a Product konstruktor

        int counter = Product.foodCounter;
        System.out.println(counter);

        Product kaja1 = new Product();
        Product kaja2 = new Product();

        Bread kenyer = new Bread(); // itt példányosítom a kenyeret
        // a kenyér egyszerre lesz Bread adattípusú és Product adattípusú (mivel a Bread
        // a Product leszármazottja, így a kenyér mind a két adattípust megkapja

        Milk milk = new Milk();
        System.out.println("A tej zsírtartalma: " + milk.getFat());

        Product[] foods = {kaja1, kaja2, kenyer};

        System.out.println(kaja1.foodCounter); // így csúnya a meghívás
        System.out.println(kaja2.foodCounter); // így csúnya a meghívás

       /* Mivel a foodcounter a Product osztályhoz tartozik, így a kimenet:
        2
        2
        lesz.*/

        System.out.println(Product.foodCounter); // így szép a meghívás és kiírás

    }
}
