package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        reverse(new int[0]);
        reverse(null);
        reverse(new int[]{6, 8, 9, 1});
        reverse(new int[]{13, 8, 5, 3, 2, 1, 1});
    }

    private static void reverse(int[] numbersToProcess) {
        if (numbersToProcess == null) {
            System.out.println("[!] Null");
        } else {
            System.out.println("До реверса: " + Arrays.toString(numbersToProcess));

            for (int i = 0; i < numbersToProcess.length / 2; i++) {
                int temp = numbersToProcess[i];
                numbersToProcess[i] = numbersToProcess[numbersToProcess.length - 1 - i];
                numbersToProcess[numbersToProcess.length - 1 - i] = temp;
            }

            System.out.println("После реверса: " + Arrays.toString(numbersToProcess));
        }
    }
}
