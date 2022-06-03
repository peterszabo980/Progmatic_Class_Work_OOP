package hu.progmatic.OOP_20220425.fluids_01_practice;

public class Fluid {
    private String name;
    private double density;

    public Fluid() {
    }

    public Fluid(String name, double density) {
        this.name = name;
        this.density = density;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    @Override
    public String toString() {
        return "Fluid{" +
                "name='" + name + '\'' +
                ", density=" + density +
                '}';
    }
}
