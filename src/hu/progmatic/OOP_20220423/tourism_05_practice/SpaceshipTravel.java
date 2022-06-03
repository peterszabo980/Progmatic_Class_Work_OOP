package hu.progmatic.OOP_20220423.tourism_05_practice;

public class SpaceshipTravel {
    public static final double SPEED = 10_000_000.0;

    private Planet source;
    private Planet destination;
    private Integer price;

    public SpaceshipTravel() {
    }

    public SpaceshipTravel(Planet source, Planet destination, Integer price) {
        this.source = source;
        this.destination = destination;
        this.price = price;
    }

    public Planet getSource() {
        return source;
    }

    public void setSource(Planet source) {
        this.source = source;
    }

    public Planet getDestination() {
        return destination;
    }

    public void setDestination(Planet destination) {
        this.destination = destination;
    }

    public double getTime() {
        return getDistance() / SPEED;
    }

    public double getReturnTime() {
        return getTime() * 2.0;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public double getDistance() {
        double dx = source.getX() - destination.getX();
        double dy = source.getY() - destination.getY();
        double dz = source.getZ() - destination.getZ();

        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    @Override
    public String toString() {
        String priceInfo = price != null
                ? "ár:\t\t\t" + price + " GFt"
                : "JELENLEG NEM FOGLALHATÓ";

        return "==============================\n"
                + source.getName() + " -> " + destination.getName() + "\n"
                + "idő:\t\t" + getTime() + " óra\n"
                + priceInfo + "\n"
                + "távolság:\t" + getDistance() + " km";
    }

}
