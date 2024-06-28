package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class Reverser {
    public static void main(String[] args) {
        reverse(new int[0]);
        reverse(null);
        reverse(new int[]{6, 8, 9, 1});
        reverse(new int[]{13, 8, 5, 3, 2, 1, 1});
    }

    private static void reverse(int[] toReverse) {
        if (toReverse == null) {
            System.out.println("Вы ввели некорректное значение (" + toReverse + ")");
            return;
        }
        System.out.printf("%3sДо реверса: %s", " ", Arrays.toString(toReverse));
        int length = toReverse.length;
        for (int i = 0; i < length - 1; i++) {
            int swap = toReverse[i];
            toReverse[i] = toReverse[--length];
            toReverse[length] = swap;
        }
        System.out.println("\nПосле реверса: " + Arrays.toString(toReverse));
    }
}
