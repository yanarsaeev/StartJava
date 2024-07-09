package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;
import java.util.Random;

public class UniqueNumbersFiller {
    public static void main(String[] args) {
        fill(23, -10, 20);
        fill(10, -30, 10);
        fill(0, 34, -34);
        fill(-8, 0, 0);
    }

    static void fill(int length, int startSegment, int endSegment) {
        if (length < 1) {
            System.out.println("Длина отрезка не может быть меньше 1 (" + length + ")");
            return;
        }

        int arrLength = (int) Math.round(0.75 * (endSegment - startSegment + 1));
        int[] uniqueDigits = new int[arrLength];
        Random r = new Random();

        int count = 0;
        while (count < arrLength) {
            int digit = r.nextInt(endSegment - startSegment + 1) + startSegment;
            boolean isUnique = contains(uniqueDigits, digit);

            if (!isUnique) {
                continue;
            }

            uniqueDigits[count] = digit;
            count++;
        }

        Arrays.sort(uniqueDigits);
        System.out.println("Отсортированный массив: ");
        for (int i = 0; i < length; i++) {
            System.out.print(uniqueDigits[i] + " ");
        }
        System.out.println();
    }

    private static boolean contains(int[] uniqueDigits, int num) {
        for (int uniqueDigit : uniqueDigits) {
            if (uniqueDigit == num) {
                return false;
            }
        }
        return true;
    }
}