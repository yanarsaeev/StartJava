package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("player1 name: ");
        Player player1 = new Player(scanner.nextLine());
        System.out.print("player2 name: ");
        Player player2 = new Player(scanner.nextLine());

        GuessNumber game = new GuessNumber(player1.getName(), player2.getName());

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