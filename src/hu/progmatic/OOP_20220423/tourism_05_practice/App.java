package hu.progmatic.OOP_20220423.tourism_05_practice;
public class App {
    public static void main(String[] args) {
        Planet[] planets = {
                new Planet("001", "Föld", 0, 0, 0),
                new Planet("002", "Mars", 251_000_000, 0, 0),
                new Planet("003", "Hold", 384_400, 0, 0)
        };
        SpaceshipTravel[] spaceshipTravels = {
                new SpaceshipTravel(planets[0], planets[1], 1000),
                new SpaceshipTravel(planets[1], planets[2], 750),
                new SpaceshipTravel(planets[2], planets[0], 250)
        };
        PortalTravel[] portalTravels = {
                new PortalTravel(planets[0], planets[1], 1000),
                new PortalTravel(planets[1], planets[2], 750),
                new PortalTravel(planets[2], planets[0], 250)
        };
        Object[] dataSheets = {
                spaceshipTravels[0],
                spaceshipTravels[1],
                spaceshipTravels[2],
                portalTravels[0],
                portalTravels[1],
                portalTravels[2]
        };

        for (Object dataSheet : dataSheets) {
            System.out.println(dataSheet);
        }

        double totalTime = 0.0;

        for (SpaceshipTravel spaceshipTravel : spaceshipTravels) {
            totalTime += spaceshipTravel.getTime();
        }

        System.out.println("Átlag: " + totalTime / spaceshipTravels.length);
    }
}
