package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Player player1;
    Player player2;

    public GuessNumber(String name1, String name2) {
        player1 = new Player(name1);
        player2 = new Player(name2);
    }

    void start() {
        int attempts = 10;
        int playerAttempts = 0;
        System.out.println("Игра началась! У каждого игрока по " + attempts + " попыток.");
        Random r = new Random();
        int targetNum = r.nextInt(1, 101);

        while (true) {
            play(player1, targetNum, attempts, playerAttempts);
            if (player1.hasWon(targetNum)) {
                player1.clearNums(playerAttempts);
                break;
            }

            play(player2, targetNum, attempts, playerAttempts);
            if (player2.hasWon(targetNum)) {
                player2.clearNums(playerAttempts);
                break;
            }

            if (!player1.hasWon(targetNum) && !player2.hasWon(targetNum)) {
                System.out.println("Никто не угадал число: " + targetNum);
                break;
            }
        }
    }

    void play(Player player, int targetNum, int attempts, int playerAttempts) {
        while (playerAttempts < attempts) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Вводит " + player.getName() + ": ");
            int playerNum = scanner.nextInt();
            playerAttempts++;
            player.setNums(playerAttempts, playerNum);
            if (playerAttempts == attempts) {
                System.out.println("У " + player.getName() + " закончились попытки!");
                return;
            }
            String comparisonResult = "";
            if (player.getNum(playerNum) == targetNum) {
                System.out.println(player.getName() + " угадал число " + playerNum + " с " +
                        playerAttempts + "-й попытки!");
                player.getNums(playerAttempts);
                return;
            }

            if (player.getNum(playerNum) > targetNum) {
                comparisonResult = "больше";
            } else if (player.getNum(playerNum) < targetNum) {
                comparisonResult = "меньше";
            }

            System.out.println("Число " + player.getNum(playerNum) +
                    " " + comparisonResult + " того, что загадал компьютер");
        }
    }
}