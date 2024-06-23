package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;
import java.util.Random;

public class RandomDigits {
    public static void main(String[] args) {
        rand(23, -10, 20);
    }

     static void rand(int length, int startSegment, int endSegment) {
        if (length < 1) {
            System.out.println("Длина отрезка не может быть меньше 1 (" + length + ")");
        } else {
            int[] randomDigits = new int[(length / 4) * 3];
            Random r = new Random();

            for (int i = 0; i < randomDigits.length; i++) {
                int randomDigit = r.nextInt(startSegment, endSegment + 1);
                boolean isRepeat = true;
                for (int j = 0; j < i; j++) {
                    if (randomDigits[i] == randomDigit) {
                        isRepeat = false;
                        break;
                    }
                }

                if (isRepeat) {
                    randomDigits[i] = randomDigit;
                } else {
                    i--;
                }
            }

            Arrays.sort(randomDigits);

            for (int randomDigit : randomDigits) {
                System.out.print(randomDigit + " ");
            }
        }
    }
}
