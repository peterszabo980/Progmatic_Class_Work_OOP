package hu.progmatic.OOP_20220425.fluids_01_practice;

public class Container {
    private Fluid fluid;

    public Container() {
    }

    public Container(Fluid fluid) {
        this.fluid = fluid;
    }

    public Fluid getFluid() {
        return fluid;
    }

    public void setFluid(Fluid fluid) {
        this.fluid = fluid;
    }

    public double getVolume() {
        return 0.0;
    }

    public double getWeight() {
        return fluid.getDensity() * getVolume();
    }
}
