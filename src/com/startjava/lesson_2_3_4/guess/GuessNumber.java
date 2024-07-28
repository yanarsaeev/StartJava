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

    void generate() {
        System.out.println("Игра началась! У каждого игрока по " + attempts + " попыток.");
        Random r = new Random();
        int targetNum = r.nextInt(1, 101);

        start(targetNum);
        System.out.println("Ходы " + player1.getName() + ": " + printAttempts(player1));
        System.out.println("Ходы " + player2.getName() + ": " + printAttempts(player2));
        player1.clearNums();
        player2.clearNums();
    }

    private void start(int targetNum) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= attempts; i++) {
            play(player1, targetNum, i, scanner);
            if (player1.getNum() == targetNum) {
                break;
            }

            play(player2, targetNum, i, scanner);
            if (player2.getNum() == targetNum) {
                break;
            }
        }

        if (player1.getNum() != targetNum && player2.getNum() != targetNum) {
            System.out.println("Никто не угадал число: " + targetNum);
        }
    }

    private void play(Player player, int targetNum, int playerAttempts, Scanner scanner) {
        enterNum(player, playerAttempts, scanner);

        if (isGuessed(player, targetNum)) {
            return;
        }

        hasAttempt(player);
    }

    private void enterNum(Player player, int playerAttempts, Scanner scanner) {
        System.out.println("Вводит " + player.getName() + ": ");
        int playerNum = scanner.nextInt();
        player.setAttempt(playerAttempts);
        player.setNum(playerNum);
    }

    private void hasAttempt(Player player) {
        if (player.getAttempt() == attempts) {
            System.out.println("У " + player.getName() + " закончились попытки!");
        }
    }

    private boolean isGuessed(Player player, int targetNum) {
        String comparisonResult = "";
        if (player.getNum() == targetNum) {
            System.out.println(player.getName() + " угадал число " + player.getNum() + " с " +
                    player.getAttempt() + "-й попытки!");
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

    String printAttempts(Player player) {
        return Arrays.toString(player.getNums());
    }
}