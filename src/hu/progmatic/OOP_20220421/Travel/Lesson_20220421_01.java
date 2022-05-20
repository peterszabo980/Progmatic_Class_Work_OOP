package hu.progmatic.OOP_20220421.Travel;

import hu.progmatic.OOP_20220421.Travel.cargo.Water;

public class Lesson_20220421_01 {
    public static void main(String[] args) {
        //2. példa
        Water water = new Water();
        water.setVolume(200.0);
        water.setUnitPrice(10.0);

        System.out.println(water.getPrice());
    }
}
