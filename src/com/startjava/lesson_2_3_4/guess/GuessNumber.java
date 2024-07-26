package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Player player1;
    Player player2;

    GuessNumber(String name1, String name2) {
        player1 = new Player(name1);
        player2 = new Player(name2);
    }

    void start() {
        int attempts = 10;
        int playerAttempts = 0;
        System.out.println("Игра началась! У каждого игрока по " + attempts + " попыток.");
        Random r = new Random();
        int targetNum = r.nextInt(1, 101);

        finishGame(targetNum, attempts, playerAttempts);
    }

    void play(Player player, int targetNum, int attempts, int playerAttempts) {
        Scanner scanner = new Scanner(System.in);
        while (playerAttempts < attempts) {
            System.out.println("Вводит " + player.getName() + ": ");
            int playerNum = scanner.nextInt();
            playerAttempts++;
            player.setAttempt(playerAttempts, playerNum);

            if (checkAttempt(player, attempts, playerAttempts)) {
                break;
            }

            if (checkNumGuessed(player, targetNum, playerNum, playerAttempts)) {
                break;
            }

            checkNum(player, targetNum);
        }
    }

    void finishGame(int targetNum, int attempts, int playerAttempts) {
        while (true) {
            play(player1, targetNum, attempts, playerAttempts);
            if (player1.getAttempt() == targetNum) {
                player1.clearNums(playerAttempts);
                break;
            }

            play(player2, targetNum, attempts, playerAttempts);
            if (player2.getAttempt() == targetNum) {
                player2.clearNums(playerAttempts);
                break;
            }

            if (player1.getAttempt() != targetNum && player2.getAttempt() != targetNum) {
                System.out.println("Никто не угадал число: " + targetNum);
                break;
            }
        }
    }

    boolean checkAttempt(Player player, int attempts, int playerAttempts) {
        if (playerAttempts == attempts) {
            System.out.println("У " + player.getName() + " закончились попытки!");
            return true;
        }
        return false;
    }

    boolean checkNumGuessed(Player player, int targetNum, int playerNum, int playerAttempts) {
        if (player.getAttempt() == targetNum) {
            System.out.println(player.getName() + " угадал число " + playerNum + " с " +
                    playerAttempts + "-й попытки!");
            player.getNums(playerAttempts);
            return true;
        }
        return false;
    }

    void checkNum(Player player, int targetNum) {
        String comparisonResult = "";
        if (player.getAttempt() > targetNum) {
            comparisonResult = "больше";
        } else if (player.getAttempt() < targetNum) {
            comparisonResult = "меньше";
        }

        System.out.println("Число " + player.getAttempt() +
                " " + comparisonResult + " того, что загадал компьютер");
    }
}