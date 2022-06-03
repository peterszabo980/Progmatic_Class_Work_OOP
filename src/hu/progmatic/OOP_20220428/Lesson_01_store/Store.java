package hu.progmatic.OOP_20220428.Lesson_01_store;

public class Store {
    private final Inventory[] inventories;

    public Store(int inventorySiza) {
        this.inventories = new Inventory[inventorySiza];
    }

    public void addInventory(Inventory newInventory) {
        Inventory box = null;

        for (Inventory inventory : inventories) {
            if (newInventory.equals(inventory)) {
                box = inventory;
                break;
            }
        }

        // ha még nincs ilyen doboz a raktrában, akkor megkeresük az első üres helyet a raktárban
        // és létrehozunk egy új dobozt
        if (box == null) {
            for (int i = 0; i < inventories.length; i++) {
                if (inventories[i] == null) {
                    inventories[i] = new Inventory(newInventory.getProduct(), newInventory.getQuantity());
                    break;
                }
            }
        } else {
            // ha már van ilyen dobou, akkor hozzáadjuk az új mennyiséget
            box.setQuantity(box.getQuantity() + newInventory.getQuantity());
        }
    }

    public void printInventories() {
        for (Inventory inventory : inventories) {
            System.out.println(inventory);
        }
    }


}
