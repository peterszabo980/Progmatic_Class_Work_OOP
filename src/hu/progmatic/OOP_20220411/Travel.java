package hu.progmatic.OOP_20220411;

public class Travel {
    public String from;
    public String to;
    public int time;
    public int price;


    // A másik konstruktor miatt deaktiválódik a nyelv által generált default konstruktor.
    // Ha szeretnénk, hogy továbbra is létre lehessen hozni "üres" utazásokat,
    // akkor kézzel újra létre kell hozni a default konstruktort.
    public Travel() {

    }

    public Travel(String from, String to, int time, int price) {
        this.from = from;
        this.to = to;
        this.time = time;
        this.price = price;
    }

}

