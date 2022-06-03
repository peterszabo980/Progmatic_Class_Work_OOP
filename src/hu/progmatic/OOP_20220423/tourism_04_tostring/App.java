package hu.progmatic.OOP_20220423.tourism_04_tostring;

public class App {
    public static void main(String[] args) {
        Travel.setPresident("Gyula");
        Travel.elect("Gyula", "Péter", "Ria", 1000, 2000, 3000);
        //Travel.elect("Gyula", "Péter", 1000, 2000);

        Planet[] planets = new Planet[]{
                new Planet("001","Föld", 0, 0, 0),
                new Planet("002", "Mars", 251_000_000, 0, 0),
                new Planet("003", "Hold", 384_400, 0, 0)
        };
        Travel[] travels = {
                new Travel(planets[0], planets[1], 3.5, 1000),
                new Travel(planets[1], planets[2], 0.5, 250),
                new Travel(planets[2], planets[0], 3.0, 750)
        };
        // heterogén kollekció - ha elég általános a tömb típusa, akkor tök más dolgokat tudunk közösen tárolni
        // semmilyen specifikus funkciót nem tudunk Object[]-en keresztül megvalósítani pl.: split, vagy számolni
        Object[] dataSheets = {
                "REPORTING IN PROGRESS :)",
                3,
                2,
                1,
                planets[0],
                planets[1],
                planets[2],
                travels[0],
                travels[1],
                travels[2]
        };

        /* for (Travel travel : travels) {
            System.out.println(travel);
            System.out.println();
        } */
        // kb. adatlapok nyomtatásához ideáli...
        for (Object dataSheet : dataSheets) {
            System.out.println(dataSheet);
            System.out.println();
        }

        Object o = planets[0]; // OK
        // Planet planet = o; // NEM OK, mivel az Object nem garantáltan Planet
        Planet planet = (Planet) o; // casting, kikapcsolja a védelmet, ha o nem Planet volt, akkor kivétel keletkezik
    }


}

