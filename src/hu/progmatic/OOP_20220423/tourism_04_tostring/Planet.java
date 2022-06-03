package hu.progmatic.OOP_20220423.tourism_04_tostring;

        public class Planet {
            private final String id;
            private String name;
            private int x, y, z;

        public Planet(String id) {
            this.id = id;
        }

        public Planet(String id,  String name) {
            this.id = id;
            this.name = name;
        }

        public Planet(String id, String name, int x, int y, int z) {
            this.id = id;
            this.name = name;
            this.x = x;
            this.y = y;
            this.z = z;
        }

           public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getX() {
                return x;
            }

            public void setX(int x) {
                this.x = x;
            }

            public int getY() {
                return y;
            }

            public void setY(int y) {
                this.y = y;
            }

            public int getZ() {
                return z;
            }

            public void setZ(int z) {
                this.z = z;
            }

            // annotáció
            // meglévő funkció megváltoztatása, nem új funkció
            // @Override annotáció nem engedi, hogy véletlenül új funkciót hozzunk
            // @Override automatikus ellenőrzést hajt végre - pl.: toString
            // @Override az ellenőrzi, hogy volt-e olyan szignatúrájú metódus már létrehozva
            @Override
            public String toString() {
                return name + " (" + x + ", " + y + ", " + z + ")";
            }

             // @Override miatt megjelenik a jogos hibaüzenet
            /* @Override
            public String toString(int repeat) {
                return "Ilyen nincs. ;)";
            } */

        }
