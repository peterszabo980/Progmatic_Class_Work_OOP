package hu.progmatic.OOP_20220421.Travel.tourism;
// tömbök nélkuli metódus
public class App2 {
    public static void main(String[] args) {
        Planet earth = new Planet("Föld", 0, 0, 0);
        Planet mars = new Planet("Mars", 251_000_000, 0, 0);
        Planet moon = new Planet("Hold", 384_400, 0, 0);
        Travel earthMars = new Travel(earth, mars, 3.5, 1000);
        Travel marsMoon = new Travel(mars, moon, 0.5, 250);
        Travel moonEarth = new Travel(moon, earth, 3.0, 750);

        System.out.println("====================");
        System.out.println(earthMars.getInfoSheet());
        System.out.println();

        System.out.println("====================");
        System.out.println(marsMoon.getInfoSheet());
        System.out.println();

        System.out.println("====================");
        System.out.println(moonEarth.getInfoSheet());
        System.out.println();

    }
}
