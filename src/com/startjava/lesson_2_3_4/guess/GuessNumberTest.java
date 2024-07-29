package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("player1 name: ");
        String name1 = scanner.nextLine();
        System.out.print("player2 name: ");
        String name2 = scanner.nextLine();
        System.out.print("player3 name: ");
        String name3 = scanner.nextLine();

        GuessNumber game = new GuessNumber(name1, name2, name3);

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