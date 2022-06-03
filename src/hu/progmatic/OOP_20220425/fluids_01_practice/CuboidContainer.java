package hu.progmatic.OOP_20220425.fluids_01_practice;

public class CuboidContainer extends Container {
    private double a, b, c;

    public CuboidContainer() {

    }

    public CuboidContainer(Fluid fluid, double a, double b, double c) {
        super(fluid);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double getVolume() {
        return a * b * c;
    }
}
