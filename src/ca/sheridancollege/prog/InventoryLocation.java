/*
 * Unauthorized copying of this file, via any medium is strictly prohibited
 */

package ca.sheridancollege.prog;

public enum InventoryLocation {
    A1('A', '1'),
    A2('A', '2'),
    A3('A', '3'),
    A4('A', '4'),
    A5('A', '5');
    // TODO: Add remaining rows and columns

    public char row;
    public char column;

    InventoryLocation(char row, char column) {
        this.row = row;
        this.column = column;
    }

    public String toString() {
        return String.valueOf(this.row + this.column);
    }
}
