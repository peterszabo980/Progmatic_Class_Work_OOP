package hu.progmatic.OOP_20220421.Travel;

import hu.progmatic.OOP_20220421.Travel.ships.Pirate;
import hu.progmatic.OOP_20220421.Travel.ships.SpaceShip;

public class Lesson_20220421_03 {
    public static void main(String[] args) {
        // van egy hajó
        SpaceShip spaceShip = new SpaceShip("BlackPearl", 10, 10, 25, 100);
        // van egy kalóz, és átadjuk a kulcsát, hogy ez lesz a hajód
        SpaceShip target = new SpaceShip("Gold", 100, 100, 3000); // nem mozog, nulla a speedje - nem adom meg
        target.setCargo(100000);
        Pirate pirate = new Pirate("Jack", spaceShip);

        System.out.println(spaceShip.getCargo());
        pirate.pirate(target); // itt rabol
        System.out.println(spaceShip.getCargo());


    }
}
