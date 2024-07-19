package com.startjava.lesson_2_3_4.array;

public class AsciiPyramidPrinter {
    public static void main(String[] args) {
        printPyramid('9', '0', true);
        printPyramid('/', '!', true);
        printPyramid('A', 'J', true);
    }

    private static void printPyramid(char startChar, char endChar, boolean ascending) {
        if (startChar > endChar) {
            char swap = startChar;
            startChar = endChar;
            endChar = swap;
        }

        int charRange = Math.abs(startChar - endChar) + 1;
        StringBuilder pyramid = new StringBuilder();
        for (int i = 0; i < charRange; i++) {
            int currentChar = ascending ? startChar + i : endChar - i;
            pyramid.append(" ".repeat(charRange - i - 1))
                    .append(String.valueOf((char) currentChar).repeat(2 * i + 1))
                    .append(System.lineSeparator());
        }

        System.out.println(pyramid);
    }
}
