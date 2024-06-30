package com.startjava.lesson_2_3_4.array;

public class FactorialCalculator {
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
        for (int k : toFactorial) {
            long result = 1;
            if (k > 0) {
                System.out.print(k + "! = ");
                for (int j = 1; j <= k; j++) {
                    System.out.print(j == 1 ? j : " * " + j);
                    result *= j;
                }
                System.out.println(" = " + result);
            } else if (k == 0) {
                System.out.println(k + "! = 0");
            } else {
                System.out.println("Ошибка: факториал " + k + "! не определен");
            }
        }
    }
}
