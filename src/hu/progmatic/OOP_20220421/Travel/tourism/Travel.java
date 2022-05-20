package hu.progmatic.OOP_20220421.Travel.tourism;

public class Travel {
    private Planet source; // nem ténylegesen tartalmazza az adott bolygót, hanem hivatkozik rá
    private Planet destination; // ez is hivatkozás
    private double time;
    private Integer price;

    public Travel() {

    }

    public Travel(Planet source, Planet destination, double time, Integer price) {
        this.source = source;
        this.destination = destination;
        this.time = time;
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
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public int getPrice() {
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

    public String getInfoSheet() {
        String priceInfo =  price != null ? "ár:\t\t\t" + price + "GFt" : "Jelenleg nem foglalható";
        return source.getName() + " \t->\t" + destination.getName() + "\n"
                + "idő:\t\t" + time + " óra\n"
                + priceInfo + "\n"
                + "távolság:\t" + getDistance() + " km";
    }
}
