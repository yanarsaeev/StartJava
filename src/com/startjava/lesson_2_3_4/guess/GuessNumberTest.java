package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    private static final int PLAYERS_COUNT = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GuessNumber game = new GuessNumber(enterNames());

        String playerAnswer = "yes";
        while (!"no".equals(playerAnswer)) {
            if ("yes".equals(playerAnswer)) {
                game.start();
                System.out.print("Хотите продолжить игру? [yes / no]: ");
            } else {
                System.out.print("Введите корректный ответ [yes / no]: ");
            }
            playerAnswer = scanner.nextLine().toLowerCase();
        }
    }

    static String[] enterNames() {
        Scanner scanner = new Scanner(System.in);
        String[] players = new String[PLAYERS_COUNT];

        int count = 1;
        for (int i = 0; i < PLAYERS_COUNT; i++) {
            System.out.print("player" + count++ + " name: ");
            players[i] = scanner.nextLine();
        }

        return players;
    }
}