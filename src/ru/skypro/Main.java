package ru.skypro;

import java.sql.SQLOutput;

public class Main {
    public static int[] generateRandomArray() {
                 java.util.Random random = new java.util.Random();
                 int[] arr = new int[30];
                 for (int i = 0; i < arr.length; i++) {
                    arr[i] = random.nextInt(100_000) + 100_000;
                 }
                 return arr;
    }
    public static void main(String[] args) {

       System.out.println("    Task One");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum );
        System.out.println("    Task Two");

        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила "+ min + " рублей");
        System.out.println("Максимальная сумма трат за день составила "+ max + " рублей");
        System.out.println("    Task Three");

        double average = 0;
        for (int i = 0; i < arr.length; i++) {
            average += arr[i]/arr.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

        System.out.println("    Task Four");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0;  i--) {
            System.out.print(reverseFullName[i]);
        }

    }
}