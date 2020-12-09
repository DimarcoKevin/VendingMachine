/*
 * Unauthorized copying of this file, via any medium is strictly prohibited
 */

package ca.sheridancollege.prog;


import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Transaction {
    public final LocalDateTime created = LocalDateTime.now();
    private ArrayList<TransactionEntry> entries;

    public void addEntry(TransactionEntry entry) {
        this.entries.add(entry);
    }

    public ArrayList<TransactionEntry> getEntries() {
        return this.getEntries();
    }

    public void isPersisted() {
        throw new UnsupportedOperationException();
    }

    public static void persist(File file, ArrayList<Transaction> transactions) throws IOException {
        FileOutputStream fi = new FileOutputStream(file);
        ObjectOutputStream oi = new ObjectOutputStream(fi);
        oi.writeObject(transactions);
    }

    public static ArrayList<Transaction> load(File file) throws IOException, ClassNotFoundException {
        FileInputStream fi = new FileInputStream(file);
        ObjectInputStream oi = new ObjectInputStream(fi);
        return (ArrayList<Transaction>) oi.readObject();
    }
}