package hu.progmatic.OOP_20220427.shop;
    // gyerekosztály / számramatatott osztály
    public class Bread extends Food {

        public Bread() {
            super(1.0, "kilo", false, 21);
        }

        public Bread(double quantity, String unitType, boolean isLongLife, int price) {
            super(quantity, unitType, isLongLife, price);
        }

        public void increasePrice() {
            this.price = this.price + 1;
            //setPrice( getPrice() + 1);
        }

    }
