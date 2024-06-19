package com.startjava.lesson_2_3_4.array;

public class Pyramid {
    public static void main(String[] args) {
        pyramidSort('0', '9', true);
    }

    public static void pyramidSort(char startChar, char endChar, boolean ascending) {
        int charRange = Math.abs(startChar - endChar) + 1;
        StringBuilder pyramid = new StringBuilder();

        if (ascending) {
            for (int i = 0; i < charRange; i++) {
                int currentChar = endChar - i;

                for (int j = 0; j < i + 1; j++) {
                    pyramid.append((char) currentChar);
                }

                for (int j = 0; j < charRange - i - 1; j++) {
                    pyramid.append(" ");
                }

                pyramid.append(System.lineSeparator());
            }
        } else {
            for (int i = 0; i < charRange; i++) {
                int currentChar = startChar + i;

                for (int j = 0; j < i + 1; j++) {
                    pyramid.append((char) currentChar);
                }

                for (int j = 0; j < charRange - i - 1; j++) {
                    pyramid.append(" ");
                }

                pyramid.append("\n");
            }
        }

        System.out.println(pyramid);
    }
}
