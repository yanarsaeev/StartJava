package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private final Player player1;
    private final Player player2;

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

    private void finishGame(int targetNum, int attempts, int playerAttempts) {
        while (true) {
            play(player1, targetNum, attempts, playerAttempts);
            if (player1.getNum() == targetNum) {
                player1.clearNums();
                break;
            }

            play(player2, targetNum, attempts, playerAttempts);
            if (player2.getNum() == targetNum) {
                player2.clearNums();
                break;
            }

            if (player1.getNum() != targetNum && player2.getNum() != targetNum) {
                System.out.println("Никто не угадал число: " + targetNum);
                break;
            }
        }
    }

    private void play(Player player, int targetNum, int attempts, int playerAttempts) {
        Scanner scanner = new Scanner(System.in);
        while (player.getAttempt() < attempts) {
            System.out.println("Вводит " + player.getName() + ": ");
            int playerNum = scanner.nextInt();
            playerAttempts++;
            player.setAttempt(playerAttempts);
            player.setNum(playerNum);

            if (checkAttempt(player, attempts)) {
                break;
            }

            if (checkNum(player, targetNum)) {
                break;
            }
        }
    }

    private boolean checkAttempt(Player player, int attempts) {
        if (player.getAttempt() == attempts) {
            System.out.println("У " + player.getName() + " закончились попытки!");
            return true;
        }
        return false;
    }

    private boolean checkNum(Player player, int targetNum) {
        String comparisonResult = "";
        if (player.getNum() > targetNum) {
            comparisonResult = "больше";
        } else if (player.getNum() < targetNum) {
            comparisonResult = "меньше";
        } else if (player.getNum() == targetNum) {
            System.out.println(player.getName() + " угадал число " + player.getNum() + " с " +
                    player.getAttempt() + "-й попытки!");
            System.out.println(Arrays.toString(player.getNums()));
            return true;
        }

        System.out.println("Число " + player.getNum() +
                " " + comparisonResult + " того, что загадал компьютер");
        return false;
    }
}