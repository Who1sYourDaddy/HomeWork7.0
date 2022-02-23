package ru.skypro;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {


        // private static int[] generateRandomArray() {
        //     int[] arr = generateRandomArray();
        //     public static int[] generateRandomArray() {
        //         java.util.Random random = new java.util.Random();
        //         int[] arr = new int[30];
        //         for (int i = 0; i < arr.length; i++) {
        //             arr[i] = random.nextInt(100_000) + 100_000;
        //         }
        //         return arr;
        //     }
        // }
        System.out.println("    Task One");
        int[] moneyApril = {157000, 143000, 108000, 179000, 117000, 112000, 156000, 124000, 196000, 126000, 159000};
        int sum = 0;
        for (int i = 0; i < moneyApril.length; i++) {
            sum += moneyApril[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum );
        System.out.println("    Task Two");

        int min = moneyApril[0];
        int max = moneyApril[0];
        for (int i = 0; i < moneyApril.length; i++) {
            if (min > moneyApril[i]) {
                min = moneyApril[i];
            }
            if (max < moneyApril[i]) {
                max = moneyApril[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила "+ min + " рублей");
        System.out.println("Максимальная сумма трат за день составила "+ max + " рублей");
        System.out.println("    Task Three");

        //double average = 0;
        //for (double i = 0; i < moneyApril.length; i++) {
            average += moneyApril[i]/moneyApril.length;
        }
        System.out.println(average);
    }
}