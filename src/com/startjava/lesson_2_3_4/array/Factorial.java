package com.startjava.lesson_2_3_4.array;

public class Factorial {
    public static void main(String[] args) {
        findFactorial(null);
        findFactorial(new int[]{8, 0, 9});
        findFactorial(new int[]{-3, 1, 7, 13});
        findFactorial(new int[]{-22, -0});
    }

    private static void findFactorial(int... numbersToFactorial) {
        if (numbersToFactorial == null) {
            System.out.println("[!] Null");
        } else {
            long result = 1;
            int numbersToFactorialLength = numbersToFactorial.length;
            for (int i = 0; i < numbersToFactorialLength; i++) {
                if (numbersToFactorial[i] > 0) {
                    System.out.print(numbersToFactorial[i] + "! = ");
                    for (int j = 1; j <= numbersToFactorial[i]; j++) {
                        System.out.print(j == 1 ? j : " * " + j);
                        result *= j;
                    }
                    System.out.println(" = " + result);
                    result = 1;
                } else if (numbersToFactorial[i] == 0) {
                    System.out.println(numbersToFactorial[i] + "! = 0");
                } else {
                    System.out.println("Ошибка: факториал " + numbersToFactorial[i] + "! не определен");
                }
            }
        }
    }
}
