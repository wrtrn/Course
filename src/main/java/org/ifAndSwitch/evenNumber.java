package org.ifAndSwitch;

import java.util.Scanner;

public class evenNumber {
    public static void main(String[] args) {
        evenCheck();
    }


    private static void evenCheck() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int firstNumber = scanner.nextInt();

        if (firstNumber != 0) {
            if (firstNumber % 2 == 0) {
                System.out.println("Четное");
            } else {
                System.out.println("Нечетное");
            }
        } else {
            System.out.println("Это ноль");
        }
    }
}
