/*
 * Unauthorized copying of this file, via any medium is strictly prohibited
 */

package ca.sheridancollege.prog;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Machine extends Application implements Initializable {
    private File inventoriesFile;
    private File productsFile;
    private File transactionsFile;
    private File entriesFile;
    private File ordersFile;

    static final int SHELF_COL = 10;
    static final int SHELF_ROW = 6;
    private ArrayList<Inventory> inventories;
    private ArrayList<Transaction> transactions = new ArrayList();

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("machine.fxml"));
        primaryStage.setTitle("PROG24178-VendingMachine");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public void voidTransaction(Transaction transaction) {
        transactions.remove(transaction);
    }

    public void persistAll() {
        try {
            Inventory.persist(this.inventoriesFile, inventories);
        } catch (IOException e) {
            // TODO: Handle failure to persist inventories exception
            e.printStackTrace();
        }

        try {
            Transaction.persist(this.transactionsFile, transactions);
        } catch (IOException e) {
            // TODO: Handle failure to persist transactions exception
            e.printStackTrace();
        }

        // TransactionEntries would persist within 'Transaction.persist()'
    }

    //
    public void auditInventory() {
        for (Inventory pArr : inventories) {
            //quantity refers to entry quantity not product quantity. need some way to avoid ambiguity
            if (pArr.getQty() <= pArr.getMin()) {
                throw new UnsupportedOperationException();
            }
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
