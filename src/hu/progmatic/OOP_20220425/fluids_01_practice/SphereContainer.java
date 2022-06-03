package hu.progmatic.OOP_20220425.fluids_01_practice;

public class SphereContainer extends Container {
    private double r;

    public SphereContainer() {
        // super();
    }

    public SphereContainer(Fluid fluid, double r) {
        super(fluid);
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * r * r * r;
    }
}
