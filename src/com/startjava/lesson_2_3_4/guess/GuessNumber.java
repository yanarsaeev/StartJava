package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private final Player player1;
    private final Player player2;
    private final int attempts = 10;

    GuessNumber(String name1, String name2) {
        player1 = new Player(name1);
        player2 = new Player(name2);
    }

    void start() {
        System.out.println("Игра началась! У каждого игрока по " + attempts + " попыток.");
        Random r = new Random();
        int targetNum = r.nextInt(1, 101);

        checkNum(targetNum);
        player1.clearNums();
        player2.clearNums();
    }

    private void checkNum(int targetNum) {
        while (true) {
            play(player1, targetNum);
            if (player1.getNum() == targetNum) {
                break;
            }

            play(player2, targetNum);
            if (player2.getNum() == targetNum) {
                break;
            }

            if (player1.getNum() != targetNum && player2.getNum() != targetNum) {
                System.out.println("Никто не угадал число: " + targetNum);
                break;
            }
        }
    }

    private void play(Player player, int targetNum) {
        int playerAttempts = 0;
        while (player.getAttempt() < attempts) {
            playerAttempts++;
            enterNum(player, playerAttempts);

            if (!hasAttempt(player)) {
                break;
            }

            if (isGuessed(player, targetNum)) {
                break;
            }
        }
    }

    private void enterNum(Player player, int playerAttempts) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вводит " + player.getName() + ": ");
        int playerNum = scanner.nextInt();
        player.setAttempt(playerAttempts);
        player.setNum(playerNum);
    }

    private boolean hasAttempt(Player player) {
        if (player.getAttempt() == attempts) {
            System.out.println("У " + player.getName() + " закончились попытки!");
            return false;
        }
        return true;
    }

    private boolean isGuessed(Player player, int targetNum) {
        String comparisonResult = "";
        if (player.getNum() == targetNum) {
            System.out.println(player.getName() + " угадал число " + player.getNum() + " с " +
                    player.getAttempt() + "-й попытки!");
            printAttempts(player);
            return true;
        }

        if (player.getNum() > targetNum) {
            comparisonResult = "больше";
        } else if (player.getNum() < targetNum) {
            comparisonResult = "меньше";
        }

        System.out.println("Число " + player.getNum() +
                " " + comparisonResult + " того, что загадал компьютер");
        return false;
    }

    void printAttempts(Player player) {
        System.out.println(Arrays.toString(player.getNums()));
    }
}