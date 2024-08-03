package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private static final int ATTEMPTS = 10;
    private static final int PLAYERS_COUNT = 3;
    private final Player[] players = new Player[PLAYERS_COUNT];

    GuessNumber(String[] names) {
        for (int i = 0; i < PLAYERS_COUNT; i++) {
            players[i] = new Player(names[i]);
        }
    }

    void start() {
        System.out.println("Игра началась! У каждого игрока по " + ATTEMPTS + " попыток.");
        Random r = new Random();
        castLots();
        startGameplay(r);
    }

    private void castLots() {
        Random r = new Random();
        int length = players.length;
        for (int i = length; i > 1; i--) {
            int j = r.nextInt(i);
            Player temp = players[j];
            players[j] = players[i - 1];
            players[i - 1] = temp;
        }
    }

    private void startGameplay(Random random) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= PLAYERS_COUNT; i++) {
            int targetNum = random.nextInt(1, 101);
            System.out.println("ROUND " + i);
            boolean isWinner = false;
            for (int j = 1; j <= ATTEMPTS; j++) {
                for (Player player : players) {
                    player.setAttempt(j);
                    if (makeMove(player, targetNum, scanner)) {
                        isWinner = true;
                        player.incrementWin();
                        break;
                    }
                }
                if (isWinner) {
                    break;
                }
            }

            if (!isWinner) {
                System.out.println("Никто не угадал число: " + targetNum);
            }

            printAttempts();
            System.out.println();
        }

        identifyWinner();
        clearAttempts();
    }

    private boolean makeMove(Player player, int targetNum, Scanner scanner) {
        enterNum(player, scanner);
        if (isGuessed(player, targetNum)) {
            checkAttempt(player);
            return true;
        }
        return false;
    }

    private void enterNum(Player player, Scanner scanner) {
        System.out.println("Вводит " + player.getName() + ": ");
        int num = scanner.nextInt();
        while (true) {
            if (player.setNum(num)) return;

            System.out.print("Число должно входить в интервал [1, 100].\nПопробуйте еще раз: ");
            num = scanner.nextInt();
        }
    }

    private boolean isGuessed(Player player, int targetNum) {
        if (player.getNum() == targetNum) {
            System.out.println(player.getName() + " угадал число " + player.getNum() + " с " +
                    player.getAttempt() + "-й попытки!");
            return true;
        }

        String comparisonResult = player.getNum() > targetNum ? "больше" : "меньше";
        System.out.println("Число " + player.getNum() +
                " " + comparisonResult + " того, что загадал компьютер");
        return false;
    }

    private void checkAttempt(Player player) {
        if (player.getAttempt() == ATTEMPTS) {
            System.out.println("У " + player.getName() + " закончились попытки!");
        }
    }

    void printAttempts() {
        for (Player player : players) {
            System.out.print("Ходы " + player.getName() + ": \n");
            for (int i : player.getNums()) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    void identifyWinner() {
        String name = "";
        int max = 0;

        for (Player player : players) {
            if (player.getWin() > max) {
                max = player.getWin();
                name = player.getName();
            }
        }

        if (max == 0) {
            System.out.println("Никто не выиграл!");
        } else {
            System.out.println("ПОБЕДИТЕЛЬ - " + name);
        }
    }

    void clearAttempts() {
        for (Player player : players) {
            player.clearNums();
        }
    }
}