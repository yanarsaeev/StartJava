package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class Reversion {
    public static void main(String[] args) {
        reverse(new int[0]);
        reverse(null);
        reverse(new int[]{6, 8, 9, 1});
        reverse(new int[]{13, 8, 5, 3, 2, 1, 1});
    }

    private static void reverse(int[] numbersToProcess) {
        if (numbersToProcess == null) {
            System.out.println("Вы ввели некорректное значение (" + numbersToProcess + ")");
        } else {
            System.out.printf("%3sДо реверса: %s", " ", Arrays.toString(numbersToProcess));
            int numberToProcessReducedLength = numbersToProcess.length - 1;
            for (int i = 0; i < numbersToProcess.length / 2; i++) {
                int swap = numbersToProcess[i];
                numbersToProcess[i] = numbersToProcess[numberToProcessReducedLength];
                numbersToProcess[numberToProcessReducedLength] = swap;
                numberToProcessReducedLength--;
            }
            System.out.println();
            System.out.println("После реверса: " + Arrays.toString(numbersToProcess));
        }
    }
}
