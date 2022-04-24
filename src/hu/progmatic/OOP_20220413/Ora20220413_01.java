package hu.progmatic.OOP_20220413;

public class Ora20220413_01 {
    public static void main(String[] args) {

        ShipContainer shipContainer1 = new ShipContainer();
        System.out.println(shipContainer1.size);
        System.out.println(shipContainer1.type);
        System.out.println(shipContainer1.isUsed);
        System.out.println("----------------------");
        ShipContainer shipContainer2 = new ShipContainer("hajózási", "zöld", 20, true);
        System.out.println(shipContainer2.size);
        System.out.println(shipContainer2.type);
        System.out.println(shipContainer2.isUsed);
        System.out.println("----------------------");
        ShipContainer shipContainer3 = new ShipContainer(40);
        System.out.println(shipContainer3.size);
        System.out.println(shipContainer3.type);
        System.out.println(shipContainer3.isUsed);
        System.out.println("----------------------");
        ShipContainer shipContainer4 = new ShipContainer(10, true);
        System.out.println(shipContainer4.size);
        System.out.println(shipContainer4.type);
        System.out.println(shipContainer4.isUsed);


    }



}
