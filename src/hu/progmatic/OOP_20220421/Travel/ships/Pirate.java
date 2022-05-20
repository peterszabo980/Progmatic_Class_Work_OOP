package hu.progmatic.OOP_20220421.Travel.ships;

public class Pirate {
    private String name;
    SpaceShip spaceShip;

    public Pirate() {

    }

    public Pirate(String name, SpaceShip spaceShip) {
        this.name = name;
        this.spaceShip = spaceShip;
    }

    public void pirate(SpaceShip target) {
        /*
        ha nincs hajónk, akkor nem tudunk rabolni, azonnal kilépünk
        if (spaceShip == null) {
            return;;
        }*/
        // spaceShip != null ugyan az, mint itt feljebb
        if (spaceShip != null &&  spaceShip.getSpeed() > target.getSpeed()) {
            int loot = target.getCargo();

            if (loot > spaceShip.getMaxCargo()) {
                loot = spaceShip.getMaxCargo();
            }
            spaceShip.setCargo(spaceShip.getCargo() + loot);
            target.setCargo(target.getCargo() - loot);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SpaceShip getSpaceShip() {
        return spaceShip;
    }

    public void setSpaceShip(SpaceShip spaceShip) {
        this.spaceShip = spaceShip;
    }
}
