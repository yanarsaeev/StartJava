package com.startjava.lesson_2_3_4.guess;

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

        startGameplay(targetNum);
        printAttempts(player1);
        printAttempts(player2);
        player1.clearNums();
        player2.clearNums();
    }

    private void startGameplay(int targetNum) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= attempts; i++) {
            player1.setAttempt(i);
            makeMove(player1, targetNum, scanner);
            if (player1.getNum() == targetNum) {
                break;
            }

            player2.setAttempt(i);
            makeMove(player2, targetNum, scanner);
            if (player2.getNum() == targetNum) {
                break;
            }
        }

        if (player1.getNum() != targetNum && player2.getNum() != targetNum) {
            System.out.println("Никто не угадал число: " + targetNum);
        }
    }

    private void makeMove(Player player, int targetNum, Scanner scanner) {
        enterNum(player, scanner);
        if (isGuessed(player, targetNum)) return;
        checkAttempt(player);
    }

    private void enterNum(Player player, Scanner scanner) {
        System.out.println("Вводит " + player.getName() + ": ");
        player.setNum(scanner.nextInt());
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

    private void checkAttempt(Player player) {
        if (player.getAttempt() == attempts) {
            System.out.println("У " + player.getName() + " закончились попытки!");
        }
    }

    void printAttempts(Player player) {
        System.out.println("Ходы " + player.getName() + ":");
        int length = player.getNums().length;
        for (int i = 0; i < length; i++) {
            System.out.print(player.getNums()[i] + " ");
            if (i == length / 2 - 1) {
                System.out.println();
            }
        }
        System.out.println();
    }
}