package hu.progmatic.OOP_20220421.Travel.ships;

public class SpaceShip2 {
    private String type;
    private int speed;
    private int w, h, l;
    private int volume;

    public SpaceShip2() {

    }

   public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getW() {
        return w;
    }
    // ha a 3 oldal közül változik valamelyik oldal változik, akkor váltzik a térfogat és ezt a setter-ben meg lehet oldani
    // akkor a volumen frissül
    public void setW(int w) {
        this.w = w;
        this.volume = this.w * this.h * this.l;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
        this.volume = this.w * this.h * this.l;

    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
        this.volume = this.w * this.h * this.l;

    }

    public int getVolume() {
        return volume;
    }
}
