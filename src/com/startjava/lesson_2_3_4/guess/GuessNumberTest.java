package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] players = new String[3];

        int count = 1;
        for (int i = 0; i < players.length; i++) {
            System.out.print("player" + count++ + " name: ");
            players[i] = scanner.nextLine();
        }

        GuessNumber game = new GuessNumber(players);

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
}