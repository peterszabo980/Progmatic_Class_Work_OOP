package hu.progmatic.OOP_20220423;

public class Travel {
    public static final int Founded = 2210; // lehet publiccal létrehozni, mert soha nem fog változni, ez egy adottság
    // hogy 2210-ben lett alapítva. Ha privattal hoztuk volna létre, akkor kellett volna hozzás getter is.
    private static String president; // az nem csak azt jelenti, hogy csak objektum szinten látszódik, hanem, hogy nem
    // akarjuk engedni, hogy a főprogramból vki "választás nélkül elnök akarjon lenni"

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


     public static void elect(String candidate1, String candidate2, String candidate3, int vote1, int vote2, int vote3) {
        if (vote1 >= vote2 && vote1 >= vote3) {
            president = candidate1; // nem fontos a setPresident-et használni, mert osztályon belül vagyunk - ez a
            // közvetlen-mezőhozzáférés
        } else if (vote2 >= vote1 && vote2 >= vote3) { // rövidítve vote2 >= vote3
            president = candidate2;
        } else {
            president = candidate3;
        }
     }

     public static void elect(String candidate1, String candidate2, int vote1, int vote2) {
        elect(candidate1, candidate2, null, vote1, vote2, Integer.MIN_VALUE);
     }

     // az elnököt egy konkrét utazás nélkül is be lehet állítani, azért static
     public static String getPresident() {
        return president;
     }

     public static void setPresident(String president) {
        Travel.president = president;
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

    public String getInfoSheet() {
        return "===============================\n"
                + "\t Alapítva:\t" + Founded + "\n"
                + "\t Elnök:\t\t" + president + "\n"
                + "===============================\n"
                + source.getName() + " \t->\t" + destination.getName() + "\n"
                + "idő:\t\t" + time + " óra\n"
                + "ár:\t\t\t" + price + " GFt\n"
                + "távolság:\t" + getDistance() + " km";
    }
}
