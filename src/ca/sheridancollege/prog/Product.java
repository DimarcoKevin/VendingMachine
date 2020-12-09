/*
 * Unauthorized copying of this file, via any medium is strictly prohibited
 */

package ca.sheridancollege.prog;


import java.io.*;
import java.util.ArrayList;

public class Product {

    private final String SKU;
    private String name;
    private float cost;
    private int qty;
    private Unit units;
    private String desc;
    private String description;
    private boolean persisted;

    public Product(String SKU, String name, float cost, int qty, Unit units, String desc, String description){
        this.SKU = SKU;
        setName(name);
        setCost(cost);
        setQty(qty);
        setUnits(units);
        setDesc(desc);
        setDescription(description);
    }
    
    /**
     * @return the SKU
     */
    public String getSKU() {
        return SKU;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the cost
     */
    public float getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(float cost) {
        this.cost = cost;
    }

    /**
     * @return the qty
     */
    public int getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(int qty) {
        this.qty = qty;
    }

    /**
     * @return the units
     */
    public Unit getUnits() {
        return units;
    }

    /**
     * @param units the units to set
     */
    public void setUnits(Unit units) {
        this.units = units;
    }

    /**
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * @param desc the desc to set
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the persisted
     */
    public boolean isPersisted() {
        return persisted;
    }

    /**
     * @param persisted the persisted to set
     */
    public void setPersisted(boolean persisted) {
        this.persisted = persisted;
    }

    public static void persist(File file, ArrayList<Product> products) throws IOException {
        FileOutputStream fi = new FileOutputStream(file);
        ObjectOutputStream oi = new ObjectOutputStream(fi);
        oi.writeObject(products);
    }

    public static ArrayList<Product> load(File file) throws IOException, ClassNotFoundException {
        FileInputStream fi = new FileInputStream(file);
        ObjectInputStream oi = new ObjectInputStream(fi);
        return (ArrayList<Product>) oi.readObject();
    }
}
