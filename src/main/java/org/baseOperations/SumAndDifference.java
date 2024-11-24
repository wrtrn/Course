package org.baseOperations;

import java.util.Scanner;

public class SumAndDifference {
    public static void main(String[] args) {
        counter();
    }

    public static void counter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int first = scanner.nextInt();
        System.out.println("Введите второе число");
        int second = scanner.nextInt();

        int difference  = first - second;
        System.out.println("Разность = " + difference);

        int sum = first + second;
        System.out.println("Сумма = " + sum);
    }

}
