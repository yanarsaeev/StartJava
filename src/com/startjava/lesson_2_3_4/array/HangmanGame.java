package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HangmanGame {
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

        String[] gallows = {"_______",
                "|     |",
                "|     @",
                "|    /|\\",
                "|    / \\",
                "| GAME OVER!"
        };
        int lives = gallows.length;
        Scanner scanner = new Scanner(System.in);
        while (lives > 0 && !String.valueOf(mask).equals(hiddenWord)) {
            printGameInfo(mask, correctUsedLetters, uncorrectUsedLetters, correctUsedLettersCount,
                    uncorrectUsedLettersCount, lives);

            System.out.print("Введите букву: ");
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
                    printGallows(lives, gallows);
                } else {
                    uncorrectUsedLetters[uncorrectUsedLettersCount] = letter;
                    uncorrectUsedLettersCount++;
                    lives--;
                    printGallows(lives, gallows);
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

        System.out.println("\nКоличество ошибок: " + uncorrectUsedLettersCount);
        System.out.println(Arrays.toString(uncorrectUsedLetters));

        System.out.println("\nКоличество угаданных букв: " + correctUsedLettersCount);
        System.out.println(Arrays.toString(correctUsedLetters));

        System.out.println("\n=========================\n");
    }

    private static void printGallows(int lives, String[] gallows) {
        int count = gallows.length;
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
