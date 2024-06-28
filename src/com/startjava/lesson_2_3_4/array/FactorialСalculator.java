package com.startjava.lesson_2_3_4.array;

public class FactorialСalculator {
    public static void main(String[] args) {
        calcFactorial(new int[0]);
        calcFactorial(null);
        calcFactorial(new int[]{8, 0, 9});
        calcFactorial(new int[]{-3, 1, 7, 13});
        calcFactorial(new int[]{-22, -0});
    }

    private static void calcFactorial(int... toFactorial) {
        if (toFactorial == null || toFactorial.length == 0) {
            System.out.println("Вы ввели некорректное значение (null or length == 0)");
            return;
        }
        for (int i = 0; i < toFactorial.length; i++) {
            long result = 1;
            if (toFactorial[i] > 0) {
                System.out.print(toFactorial[i] + "! = ");
                for (int j = 1; j <= toFactorial[i]; j++) {
                    System.out.print(j == 1 ? j : " * " + j);
                    result *= j;
                }
                System.out.println(" = " + result);
            } else if (toFactorial[i] == 0) {
                System.out.println(toFactorial[i] + "! = 0");
            } else {
                System.out.println("Ошибка: факториал " + toFactorial[i] + "! не определен");
            }
        }
    }
}
