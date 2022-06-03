package hu.progmatic.OOP_20220423.tourism_02_wrapper;

        public class Planet {
            private String name;
            private int x, y, z;

        public Planet() {
        }

        public Planet(String name) {
            this.name = name;
        }

        public Planet(String name, int x, int y, int z) {
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
        }
