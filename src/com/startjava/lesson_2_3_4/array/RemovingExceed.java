package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;
import java.util.Random;

public class RemovingExceed {
    public static void main(String[] args) {
        removeExceedingDigits(-1);
        removeExceedingDigits(15);
        removeExceedingDigits(0);
        removeExceedingDigits(14);
    }

    private static void removeExceedingDigits(int address) {
        Random r = new Random();
        double[] randomDigits = new double[15];

        if (address > randomDigits.length - 1 || address < 0) {
            System.out.println("Введен некорректный адрес ячейки");
        } else {
            for (int i = 0; i < randomDigits.length; i++) {
                randomDigits[i] = (double) Math.round(r.nextDouble(0, 1) * 1000) / 1000;
            }

            double digitInCell = 0;

            for (int i = 0; i < randomDigits.length; i++) {
                if (randomDigits[i] == randomDigits[address]) {
                    digitInCell = randomDigits[i];
                }
            }

            double[] randomDigitsWithZeros = Arrays.copyOf(randomDigits, randomDigits.length);
            int countZeroCells = 0;
            for (int i = 0; i < randomDigitsWithZeros.length; i++) {
                if (randomDigitsWithZeros[i] > digitInCell) {
                    randomDigitsWithZeros[i] = 0;
                }

                if (randomDigitsWithZeros[i] == 0) {
                    countZeroCells++;
                }
            }

            System.out.println("Массив исходный:");
            String randomDigitsString = Arrays.toString(randomDigits);
            System.out.println("[" + randomDigitsString
                    .substring(1, randomDigitsString.length() / 2));
            System.out.println(randomDigitsString.
                    substring(randomDigitsString.length() / 2, randomDigitsString.length() - 1) + "]");

            System.out.println("Массив измененный:");
            String randomDigitsWithZerosString = Arrays.toString(randomDigitsWithZeros);
            System.out.println("[" + randomDigitsWithZerosString
                    .substring(1, randomDigitsWithZerosString.length() / 2));
            System.out.println(randomDigitsWithZerosString.
                    substring(randomDigitsWithZerosString.length() / 2, randomDigitsWithZerosString.length() - 1) + "]");
            System.out.println("Значение из ячейки по переданному адресу: " + digitInCell);
            System.out.println("Количество обнуленных ячеек: " + countZeroCells);
        }
    }
}
