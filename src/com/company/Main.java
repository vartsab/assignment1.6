package com.company;

public class Main {

    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
         java.util.Random random = new java.util.Random();
         int[] arr = new int[30];
         for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
         }
         return arr;
    }

    public static void main(String[] args) {

         //#1
         System.out.println("Задача №1");

         int monthLength = 30;

         int[] expenses = new int[monthLength];
         expenses = generateRandomArray();

         double sumMonthExpenses = expenses[0];

         for (int i = 1; i < monthLength; i++) {
             sumMonthExpenses += expenses[i];
         }
         System.out.println("Сумма трат за месяц составила " + (int) sumMonthExpenses + " рублей.");

         //#2
         System.out.println("\nЗадача №2");

         int minExpense = expenses[0];
         int maxExpense = expenses[0];

         for (int i = 1; i < monthLength; i++) {
              if (minExpense > expenses[i])
                   minExpense = expenses[i];
              if (maxExpense < expenses[i])
                   maxExpense = expenses[i];
         }

         System.out.println("Минимальная сумма трат за день составила " + minExpense + " рублей.");
         System.out.println("Максимальная сумма трат за день составила " + maxExpense + " рублей.");

         //#3
         System.out.println("\nЗадача №3");

         double averageExpense = sumMonthExpenses / monthLength;
         System.out.println("Средняя сумма трат за месяц " + averageExpense + " рублей.");

         //#4
         System.out.println("\nЗадача №4");

         char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

         for ( int i = reverseFullName.length - 1; i >=0 ; i-- ) {
             System.out.print(reverseFullName[i]);
         }
    }
}
