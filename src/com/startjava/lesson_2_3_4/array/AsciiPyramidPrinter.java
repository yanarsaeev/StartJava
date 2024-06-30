package com.startjava.lesson_2_3_4.array;

public class AsciiPyramidPrinter {
    public static void main(String[] args) {
        printPyramid('0', '9', true);
        printPyramid('/', '!', false);
        printPyramid('A', 'J', false);
    }

    private static void printPyramid(char startChar, char endChar, boolean ascending) {
        int charRange = Math.abs(startChar - endChar) + 1;
        StringBuilder pyramid = new StringBuilder();

        for (int i = 0; i < charRange; i++) {
            int currentChar = ascending ? endChar - i : startChar + i;

            for (int j = 0; j < charRange - i - 1; j++) {
                pyramid.append(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                pyramid.append((char) currentChar);
            }

            pyramid.append(System.lineSeparator());
        }

        System.out.println(pyramid);
    }
}
