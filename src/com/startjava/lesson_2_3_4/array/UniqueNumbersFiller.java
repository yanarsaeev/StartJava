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

    static void fill(int numsCount, int startSegment, int endSegment) {
        if (numsCount < 1) {
            System.out.println("Длина отрезка не может быть меньше 1 (" + numsCount + ")");
            return;
        }

        int length = (int) Math.round(0.75 * (endSegment - startSegment + 1));
        int[] uniqueDigits = new int[length];
        Random r = new Random();

        int count = 0;
        while (count < length) {
            int digit = r.nextInt(startSegment, endSegment);

            if (!contains(uniqueDigits, digit)) {
                continue;
            }

            uniqueDigits[count] = digit;
            count++;
        }

        sort(uniqueDigits, length, numsCount);
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

    private static void sort(int[] uniqueDigits, int length, int numsCount) {
        Arrays.sort(uniqueDigits);
        System.out.println("Отсортированный массив: ");
        int count = 0;
        for (int i = 0; i < length; i++) {
            System.out.printf("%5d", uniqueDigits[i]);
            count++;
            if (count == numsCount) {
                System.out.println();
                count = 0;
            }
        }
    }
}