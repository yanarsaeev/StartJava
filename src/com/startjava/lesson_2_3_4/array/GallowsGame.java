package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GallowsGame {
    public static void main(String[] args) {
        startGame();
    }

    public static void startGame() {
        String[] words = {"КАМЕРА", "СЛОВО", "АБЗАЦ", "АКУЛА", "ПЕЧЕНЬЕ"};
        Random random = new Random();

        String hiddenWord = words[random.nextInt(words.length)];
        System.out.println("Добро пожаловать в игру \"Виселица\"!");

        char[] mask = new char[hiddenWord.length()];
        Arrays.fill(mask, '_');

        char[] correctUsedLetters = new char[hiddenWord.length()];
        int correctUsedLettersCount = 0;

        char[] uncorrectUsedLetters = new char[33 - hiddenWord.length()];
        int uncorrectUsedLettersCount = 0;

        int lives = 5;
        while (lives > 0 && !String.valueOf(mask).equals(hiddenWord)) {
            printGameInfo(mask, correctUsedLetters, uncorrectUsedLetters, correctUsedLettersCount,
                    uncorrectUsedLettersCount, lives);

            System.out.print("Введите букву: ");
            Scanner scanner = new Scanner(System.in);
            char letter = scanner.nextLine().toUpperCase().charAt(0);

            if (letter == ' ') {
                System.out.println("Некорректный ввод");
                continue;
            }

            boolean isLetterFound = false;
            for (char correctUsedLetter : correctUsedLetters) {
                if (letter == correctUsedLetter) {
                    System.out.println("Буква уже была введена");
                    isLetterFound = true;
                    break;
                }
            }

            if (!isLetterFound) {
                for (char uncorrectUsedLetter : uncorrectUsedLetters) {
                    if (letter == uncorrectUsedLetter) {
                        System.out.println("Буква уже была введена");
                        isLetterFound = true;
                        break;
                    }
                }
            }

            if (!isLetterFound) {
                for (int i = 0; i < hiddenWord.length(); i++) {
                    if (letter == hiddenWord.charAt(i)) {
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

        printResult(lives, hiddenWord);
    }

    private static void printGameInfo(char[] mask, char[] correctUsedLetters, char[] uncorrectUsedLetters,
                                     int correctUsedLettersCount, int uncorrectUsedLettersCount, int lives) {
        System.out.println("========GAME-INFO========");
        System.out.println("СЛОВО " + String.valueOf(mask));
        System.out.println("Количество ходов: " + lives);
        System.out.println();
        System.out.println("Количество ошибок: " + uncorrectUsedLettersCount);
        for (char letter : uncorrectUsedLetters) {
            System.out.print(letter + " ");
        }
        System.out.println();
        System.out.println("Количество угаданных букв: " + correctUsedLettersCount);
        for (char letter : correctUsedLetters) {
            System.out.print(letter + " ");
        }
        System.out.println();
        System.out.println("=========================");
        System.out.println();
    }

    private static void printGallows(int lives) {
        String[] gallows = {"_______",
                "|     |",
                "|     @",
                "|    /|\\",
                "|    / \\",
                "| GAME OVER!"
        };

        int count = 5;
        count -= lives;
        for (int i = 0; i <= count; i++) {
            System.out.println(gallows[i]);
        }
    }

    private static void printResult(int lives, String hiddenWord) {
        if (lives == 0) {
            System.out.println("К сожалению, вы не угадали слово! Ответ был - " + hiddenWord);
        } else {
            System.out.println("Ура! Вы угадали слово! Ответ был - " + hiddenWord);
        }
    }
}
