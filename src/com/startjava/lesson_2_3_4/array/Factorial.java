package com.startjava.lesson_2_3_4.array;

public class Factorial {
    public static void main(String[] args) {
        findFactorial(null);
        findFactorial(new int[]{8, 0, 9});
        findFactorial(new int[]{-3, 1, 7, 13});
        findFactorial(new int[]{-22, -0});
    }

    static void findFactorial(int... arr) {
        if (arr == null) {
            System.out.println("[!] Null");
        } else {
            long result = 1;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 0) {
                    System.out.print(arr[i] + "! = ");
                    for (int j = 1; j <= arr[i]; j++) {
                        System.out.print(j == 1 ? j : " * " + j);
                        result *= j;
                    }
                    System.out.println(" = " + result);
                    result = 1;
                } else if (arr[i] == 0) {
                    System.out.println(arr[i] + "! = 0");
                } else {
                    System.out.println("Ошибка: факториал " + arr[i] + "! не определен");
                }
            }
        }
    }
}
