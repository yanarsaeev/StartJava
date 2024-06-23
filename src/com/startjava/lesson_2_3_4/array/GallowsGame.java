package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GallowsGame {
    public static void main(String[] args) {
        startGame();
    }

    public static void startGame() {
        String[] words = {"КАМЕРА", "БЛОК", "АБЗАЦ", "АКУЛА", "ПЕЧЕНЬЕ"};
        Random random = new Random();

        String word = words[random.nextInt(words.length)];
        System.out.println("Добро пожаловать в игру \"Виселица\"!");

        char[] mask = new char[word.length()];
        Arrays.fill(mask, '_');

//      Использованные правильные буквы и их кол-во
        char[] correctUsedLetters = new char[5];
        int correctUsedLettersCount = 0;

//      Использованные неправильные буквы и их кол-во
        char[] uncorrectUsedLetters = new char[5];
        int uncorrectUsedLettersCount = 0;

        int lives = 5;

        Scanner scanner = new Scanner(System.in);

        while (lives > 0 && !String.valueOf(mask).equals(word)) {
            printGameInfo(mask, correctUsedLetters, uncorrectUsedLetters, correctUsedLettersCount,
                    uncorrectUsedLettersCount, lives);

            System.out.print("Введите букву: ");
            char letter = scanner.nextLine().toUpperCase().charAt(0);

            if (letter == ' ') {
                System.out.println("Некорректный ввод");
                continue;
            }

            boolean isLetterFound = false;
            for (int i = 0; i < correctUsedLetters.length; i++) {
                if (letter == correctUsedLetters[i]) {
                    System.out.println("Буква уже была введена");
                    isLetterFound = true;
                    break;
                }
            }

            if (!isLetterFound) {
                for (int i = 0; i < uncorrectUsedLetters.length; i++) {
                    if (letter == uncorrectUsedLetters[i]) {
                        System.out.println("Буква уже была введена");
                        isLetterFound = true;
                        break;
                    }
                }
            }

            if (!isLetterFound) {
                for (int i = 0; i < word.length(); i++) {
                    if (letter == word.charAt(i)) {
                        isLetterFound = true;
                        mask[i] = letter;
                    }
                }

                if (isLetterFound) {
                    correctUsedLetters[correctUsedLettersCount] = letter;
                    correctUsedLettersCount++;
                    lives++;
                    if (lives > 5) {
                        lives = 5;
                    }
                    printGallows(lives);
                } else {
                    uncorrectUsedLetters[uncorrectUsedLettersCount] = letter;
                    uncorrectUsedLettersCount++;
                    lives--;
                    printGallows(lives);
                }
            }
        }

        if (lives == 0) {
            System.out.println("К сожалению, вы не угадали слово! Ответ был - " + word);
        } else {
            System.out.println("Ура! Вы угадали слово! Ответ был - " + word);
        }
    }

    public static void printGameInfo(char[] mask, char[] correctUsedLetters, char[] uncorrectUsedLetters,
                                     int correctUsedLettersCount, int uncorrectUsedLettersCount, int lives) {
        System.out.println("========GAME-INFO========");
        System.out.println("СЛОВО " + String.valueOf(mask));
        System.out.println("Количество ходов: " + lives);
        System.out.println();
        System.out.println("Количество ошибок: " + uncorrectUsedLettersCount);
        for (char letter: uncorrectUsedLetters) {
            System.out.print(letter + " ");
        }
        System.out.println();
        System.out.println("Количество угаданных букв: " + correctUsedLettersCount);
        for (char letter: correctUsedLetters) {
            System.out.print(letter + " ");
        }
        System.out.println();
        System.out.println("=========================");
        System.out.println();
    }

    public static void printGallows(int lives) {
        System.out.println(" _______");
        System.out.println(" |/    |");
        System.out.println(" |    " + (lives < 5 ? "(_)" : " "));
        System.out.println(" |    " + (lives < 3 ? "_|_" : " "));
        System.out.println(" |   " + (lives < 2 ? "/ | \\" : " "));
        System.out.println(" |     " + (lives < 1 ? "|\n |    / \\\n |   /   \\\n |\n_|________\n|        |" : " "));
    }
}
