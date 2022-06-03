package hu.progmatic.OOP_20220425.fluids_01_practice;

public class App {
    public static void main(String[] args) {
        Fluid water = new Fluid("víz", 1.0);

        Container[] containers = {
                new SphereContainer(water, 1.0),
                new CuboidContainer(water, 2.0, 3.0, 4.0)
        };

        double totalWeight = 0.0;

        for (Container contaner : containers) {
            totalWeight += contaner.getWeight();
        }

        System.out.println("Folyadékok tömege: " + totalWeight);
    }
}
