package org.nestedCycles;

public class multiplicationTable {
    public static void main(String[] args) {
        showMultiplicationTable();
    }

    public static void showMultiplicationTable() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int product = j*i;
                System.out.println(i + " x " + j + " = " + product);
            }
        }
    }
}
