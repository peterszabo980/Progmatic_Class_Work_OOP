package hu.progmatic.OOP_20220411;

public class Lesson_20220411_02 {
    public static void main(String[] args) {
        // String xyz = "";
        // int abc = 123;
        // létrehozunk egy új Travel példányt (p.: @1)
        Travel moonTravel = new Travel();

        // létrehozunk egy új Travel példányt (p.: @1)
        // GC - Garbage Collector
        // logikai értelemben akkor törli a HEAP-ből az objektumot,
        // amikor elérhetetlenné válik (nem mutat rá referencia)
        // ténylegesen csak véletlenszerű időközönként fut le
        // (takarékoskodás a processzor idejével)
        moonTravel.from = "Föld";
        moonTravel.to = "Hold";
        moonTravel.time = 100;
        moonTravel.price = 1000;

        Travel marsTravel = new Travel();
        marsTravel.from = "Föld";
        marsTravel.to = "Mars";
        marsTravel.time = 350;
        marsTravel.price = 3500;

        Travel marsTravel2 = new Travel();
        marsTravel.from = "Föld";
        marsTravel.to = "Mars";
        marsTravel.time = 350;
        marsTravel.price = 3500;

        // false - két, külön objektum egyformák, de nem azonosak
        System.out.println(marsTravel == marsTravel2);
        // false - két, külön objektum egyformák, de nem azonosak
        //alapértelmezetten az equals az ==-t követi
        //Stringeknél felül van írva (ott úgy működik, ahogyan elvárjuk)
        //lehetőség van megváltoztatni (lsd. később)
        System.out.println(marsTravel.equals(marsTravel2));
        Travel favouriteTravel = marsTravel;
        // 100%-os felár kifizetése első osztályra
        favouriteTravel.price *= 2;

        travelData(moonTravel);
        travelData(marsTravel);
        travelData(favouriteTravel);

        Travel nextTravel = null;
        // ha null referencia valamelyik mezőjére hivatkozunk,
        //a akkor NullPointerException

        //nullal mindig == vagy !=
        // illetve nem null-ra xyz.equals(null) hamisat ad
        if (nextTravel != null) {

        }
    }

    public static void travelData(Travel travel){
        System.out.println("Indulás: " + travel.from);
        System.out.println("Cél: " + travel.to);
        System.out.println("Hossz: " + travel.time);
        System.out.println("Ár: " + travel.price);
    }
}
