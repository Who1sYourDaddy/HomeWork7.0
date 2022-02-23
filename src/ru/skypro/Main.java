package ru.skypro;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {


        //     Генератор случайных чисел применить не смог. Что значит "использовать не в методе Main" - не понятно. Выносил и выше
        //     public class Main, и ниже, ни где у меня не заработало. Прошу показать, как это делается или дать ссылку на урок, где это пояснили.
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
        int[] moneyApril = {157000, 143000, 108000, 179000, 117000, 112000, 156000, 124000, 196000, 126000, 159000, 137000, 168000, 147000, 136600,
                            157000, 143000, 108000, 179000, 117000, 112000, 156000, 124000, 196000, 126000, 159000, 137000, 168000, 147000, 136600};
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

        double average = 0;
        for (int i = 0; i < moneyApril.length; i++) {
            average += moneyApril[i]/moneyApril.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

        System.out.println("    Task Four");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0;  i--) {
            System.out.print(reverseFullName[i]);
        }

    }
}