package hu.progmatic.OOP_20220421.physics;

import hu.progmatic.OOP_20220421.Travel.cargo.Water;
import hu.progmatic.OOP_20220421.Travel.cargo.WaterOlda;
// import hu.progmatic.OOP_20220421.physics.material.Water; - nem lehet két különböző dolgot ugyan annak lerövidíteni

public class App  {
    public static void main(String[] args) {
        WaterOlda water1 = new WaterOlda();
        water1.setVolume(10.0);
        water1.setUnitPrice(100.0);

        hu.progmatic.OOP_20220421.physics.material.Water w2 = new hu.progmatic.OOP_20220421.physics.material.Water();

        WaterOlda wx;
        System.out.println(water1.getVolume());


    }
}
