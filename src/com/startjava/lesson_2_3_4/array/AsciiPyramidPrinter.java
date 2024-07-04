package com.startjava.lesson_2_3_4.array;

public class AsciiPyramidPrinter {
    public static void main(String[] args) {
        printPyramid('9', '0', true);
        printPyramid('/', '!', true);
        printPyramid('A', 'J', true);
    }

    private static void printPyramid(char startChar, char endChar, boolean ascending) {
        int charRange = Math.abs(startChar - endChar) + 1;
        StringBuilder pyramid = new StringBuilder();

        char ch;
        if ((int) startChar > (int) endChar) {
            ch = startChar;
            startChar = endChar;
            endChar = ch;
        }

        for (int i = 0; i < charRange; i++) {
            int currentChar = ascending ? startChar + i : endChar - i;

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
