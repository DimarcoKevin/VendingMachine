/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.prog;

import java.io.File;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kevin
 */
public class TransactionTest {
    
    public TransactionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    /**
     * Good test of addEntry method, of class Transaction.
     * Maybe test getEntries instead of addEntries
     */
    @Test
    public void testAddEntryGood() {
        System.out.println("addEntryGood");
        Transaction transaction = new Transaction();
        Product prod1 = new Product("SKUTest", "CandyName", 1.50f, 1, 
                Unit.GRAMS, "Yummy Candy", "Yummy?");  
        Product prod2 = new Product("SKUTest", "CandyName", 1.50f, 1, 
                Unit.GRAMS, "Yummy Candy", "Yummy?"); 
        Product prod3 = new Product("SKUTest", "CandyName", 1.50f, 1, 
                Unit.GRAMS, "Yummy Candy", "Yummy?"); 
        TransactionEntry instance1 = new TransactionEntry(prod1, 1);
        TransactionEntry instance2 = new TransactionEntry(prod2, 2);
        TransactionEntry instance3 = new TransactionEntry(prod3, 3);
        transaction.addEntry(instance1);
        transaction.addEntry(instance2);
        transaction.addEntry(instance3);
        assertEquals(transaction.getEntries(), (instance1));
        
        
        
        // return and test time created maybe...
    }
    /**
     * Bad test of addEntry method, of class Transaction.
     */
    @Test
    public void testAddEntryBad() {
        System.out.println("addEntryBad");
        TransactionEntry entry = null;
        Transaction instance = new Transaction();
        instance.addEntry(entry);
    }
//
//    /**
//     * Test of getEntries method, of class Transaction.
//     */
//    @Test
//    public void testGetEntries() {
//        System.out.println("getEntries");
//        Transaction instance = new Transaction();
//        ArrayList<TransactionEntry> expResult = null;
//        ArrayList<TransactionEntry> result = instance.getEntries();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of isPersisted method, of class Transaction.
//     */
//    @Test
//    public void testIsPersisted() {
//        System.out.println("isPersisted");
//        Transaction instance = new Transaction();
//        instance.isPersisted();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of persist method, of class Transaction.
//     */
//    @Test
//    public void testPersist() throws Exception {
//        System.out.println("persist");
//        File file = null;
//        ArrayList<Transaction> transactions = null;
//        Transaction.persist(file, transactions);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of load method, of class Transaction.
//     */
//    @Test
//    public void testLoad() throws Exception {
//        System.out.println("load");
//        File file = null;
//        ArrayList<Transaction> expResult = null;
//        ArrayList<Transaction> result = Transaction.load(file);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
}
