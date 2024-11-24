package org.forTasks;

public class fromOneToTen {
    public static void main(String[] args) {
        writeFromOneToTen();
    }

    private static void writeFromOneToTen() {
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        }
        while (i < 11);
    }
}
