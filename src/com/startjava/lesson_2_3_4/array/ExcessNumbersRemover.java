package com.startjava.lesson_2_3_4.array;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

public class ExcessNumbersRemover {
    public static void main(String[] args) {
        removeExcess(-1);
        removeExcess(15);
        removeExcess(0);
        removeExcess(14);
    }

    private static void removeExcess(int index) {
        Random r = new Random();
        float[] randomDigits = new float[15];
        int length = randomDigits.length;

        if (index < 0 || index > length - 1) {
            System.out.println("Введен некорректный адрес ячейки");
            return;
        }

        for (int i = 0; i < length; i++) {
            randomDigits[i] = r.nextFloat(0, 1);
        }

        System.out.println("Исходный массив: ");
        print(randomDigits);

        float digitInCell = randomDigits[index];
        int countZeroCells = 0;
        for (int i = 0; i < length; i++) {
            if (randomDigits[i] > digitInCell) {
                randomDigits[i] = 0;
                countZeroCells++;
            }
        }

        System.out.println("Измененный массив:");
        print(randomDigits);
        System.out.println("Значение из ячейки по переданному адресу: " + digitInCell);
        System.out.println("Количество обнуленных ячеек: " + countZeroCells);
    }

    private static void print(float[] toPrint) {
        int length = toPrint.length;
        for (int i = 0; i < length; i++) {
            System.out.printf("%.3f ", toPrint[i]);
            if (i == length / 2) {
                System.out.println();
            }
        }
        System.out.println();
    }
}
