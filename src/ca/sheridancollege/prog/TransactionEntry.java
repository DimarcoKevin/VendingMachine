/*
 * Unauthorized copying of this file, via any medium is strictly prohibited
 */

package ca.sheridancollege.prog;

public class TransactionEntry {
    private Product product;
    private int quantity;

    public TransactionEntry(Product product, int quantity) {
        this.product = product;
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            quantity=0;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            quantity = 0;
        }
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
