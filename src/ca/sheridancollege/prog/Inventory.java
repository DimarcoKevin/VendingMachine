/*
 * Unauthorized copying of this file, via any medium is strictly prohibited
 */

package ca.sheridancollege.prog;

import java.io.*;
import java.util.ArrayList;

public class Inventory {
    private final InventoryLocation location;
    private Product product;
    private int qty;
    private int min;
    private int max;

    // TODO: Add remaining fields to constructor
    public Inventory(InventoryLocation location) {
        this.location = location;
    }

    public int getQty() {
        return qty;
    }

    public int getMin() {
        return min;
    }

    public boolean isLow() {
        if (qty < min) {
            return true;
        }
        return false;
    }

    public static void persist(File file, ArrayList<Inventory> inventories) throws IOException {
        FileOutputStream fi = new FileOutputStream(file);
        ObjectOutputStream oi = new ObjectOutputStream(fi);
        oi.writeObject(inventories);
    }

    public static ArrayList<Inventory> load(File file) throws IOException, ClassNotFoundException {
        FileInputStream fi = new FileInputStream(file);
        ObjectInputStream oi = new ObjectInputStream(fi);
        return (ArrayList<Inventory>) oi.readObject();
    }
}
