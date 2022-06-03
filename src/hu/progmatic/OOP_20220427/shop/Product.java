package hu.progmatic.OOP_20220427.shop;

public class Product {

    // Adhatok értéket ( = inicializálás) is a változóknak, tehát default értéket adok a változóknak.
    // az így megadott értékek pedig a gyerek osztályok tovább öröklik.Tehát alapból a megadott értékek lesznek addig,
    // amíg fölül nem írom Konstruktorral vagy setter-el
    protected double quantity = 5.0;
    protected String untiType = "unknown";
    protected boolean isLongLife;
    protected int price = 1;
/*

    // a protected hatására az összes gyerek osztály tudja olvasni és írni
    protected double quantity;
    protected String untiType;
    protected boolean isLongLife;
    // main-osztályban nem látszik továbbra sem (ugyan úgy private), kell ugyan
    // úgy a getter és a setter
    protected int price; // gyerek osztályba elég a this-el "megyvni"
*/

   /* //  package private = az adott package-ben lévő osztályok elérik és szabadon használhatják
    double quantity;*/

    // public láthatósági jelző,
      // static kulcsszó --- osztályhoz tartozást jelöli,  public class Product-hoz
      // adattípus, név
      // int értéke defaultból 0-a
    public static int foodCounter;
    public Product() {
        foodCounter++;
    }
/*

    public Product() {

    }
*/

   public Product(double quantity, String untiType, int price) {
        this.quantity = quantity;
        this.untiType = untiType;
        this.price = price;
    }

  /*  public Product (double quantity, String untiType, int price) {
    }*/

    public Product (double quantity, String untiType, boolean isLongLife, int price) {
        this(quantity, untiType, price);
        this.isLongLife = isLongLife;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getUntiType() {
        return untiType;
    }

    public void setUntiType(String untiType) {
        this.untiType = untiType;
    }

    public boolean isLongLife() {
        return isLongLife;
    }

    public void setLongLife(boolean longLife) {
        isLongLife = longLife;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
