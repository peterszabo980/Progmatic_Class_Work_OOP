package hu.progmatic.OOP_20220411;

public class Lesson_20220411_05 {
    public static void main(String[] args) {
        /*
        String[] id = {"G23", "X55", "H67"};
        String[] type = {"teher", "teher", "teher"};
        boolean[] isFrieght = {false, true, true};
        int[] speed = {1000, 3500, 21000};
        */

        SpaceShip[] spaceShips = {
                //osztálypéldány készítése v. objektum készítése v. példányosítás
                new SpaceShip("G23", "teher", false, 1000),
                new SpaceShip("X55", "teher", true, 3500),
                new SpaceShip("H67", "teher", false, 21000)
        };

        // default konstruktor (ő végzi az objektum példányosítását) = bemeneteli paraméter nélküli ("üres") konstruktor
        // default konstruktor hívása
        SpaceShip ship4 = new SpaceShip();

        int sum = 0;
        for (int i = 0; i < spaceShips.length; i++) {
            sum++;
        }
        System.out.println("Teherhajók száma: " + sum);
        System.out.println("-----------------------------");

        SpaceShip lessSpeed = null;

        for (SpaceShip spaceShip: spaceShips) {
            if (lessSpeed == null || spaceShip.speed < lessSpeed.speed) {
                lessSpeed = spaceShip;
            }
        }
        System.out.println("A leglassabb űrhajó.");
        printShipData(lessSpeed);

        SpaceShip mostSpeed = null;
        for (SpaceShip spaceShip: spaceShips) {
            if (mostSpeed == null || spaceShip.speed > mostSpeed.speed) {
                mostSpeed = spaceShip;
            }
        }
        System.out.println("A leggyorsabb űrhajó.");
        printShipData(mostSpeed);
    }

    public static void printShipData(SpaceShip spaceShip){

        System.out.println("Azonosító: " + spaceShip.id);
        System.out.println("Típus: " + spaceShip.type);
        System.out.println("Repül: " + spaceShip.isFreight);
        System.out.println("Sebesség: " + spaceShip.speed);
        System.out.println("-----------------------------");

    }
}
