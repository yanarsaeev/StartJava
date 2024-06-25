package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class Reversion {
    public static void main(String[] args) {
        reverse(new int[0]);
        reverse(null);
        reverse(new int[]{6, 8, 9, 1});
        reverse(new int[]{13, 8, 5, 3, 2, 1, 1});
    }

    private static void reverse(int[] numbersToReverse) {
        if (numbersToReverse == null) {
            System.out.println("Вы ввели некорректное значение (" + numbersToReverse + ")");
        } else {
            System.out.printf("%3sДо реверса: %s", " ", Arrays.toString(numbersToReverse));
            int numberToReverseLength = numbersToReverse.length;
            int numberToReverseReduceLength = numberToReverseLength - 1;
            for (int i = 0; i < numberToReverseLength / 2; i++) {
                int swap = numbersToReverse[i];
                numbersToReverse[i] = numbersToReverse[numberToReverseReduceLength];
                numbersToReverse[numberToReverseReduceLength] = swap;
                numberToReverseReduceLength--;
            }
            System.out.println();
            System.out.println("После реверса: " + Arrays.toString(numbersToReverse));
        }
    }
}
