package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private final int PLAYERS_COUNT = 3;
    private final Player[] players = new Player[PLAYERS_COUNT];
    private final int attempts = 10;

    GuessNumber(String[] names) {
        for (int i = 0; i < players.length; i++) {
            players[i] = new Player(names[i]);
        }
    }

    void start() {
        System.out.println("Игра началась! У каждого игрока по " + attempts + " попыток.");
        Random r = new Random();
        int targetNum = r.nextInt(1, 101);
        castLots();
        startGameplay(targetNum, r);
    }

    private void castLots() {
        Random r = new Random();
        int length = players.length;
        while (length > 1) {
            length--;
            int i = r.nextInt(length);
            Player temp = players[i];
            players[i] = players[length];
            players[length] = temp;
        }
    }

    private void startGameplay(int targetNum, Random random) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= PLAYERS_COUNT; i++) {
            System.out.println("ROUND " + i);
            boolean isWinner = false;
            for (int j = 1; j <= attempts; j++) {
                for (Player player : players) {
                    player.setAttempt(j);
                    makeMove(player, targetNum, scanner);
                    if (player.getNum() == targetNum) {
                        isWinner = true;
                        player.setWin();
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

            for (Player player : players) {
                printAttempts(player);
            }

            System.out.println();
            targetNum = random.nextInt(1, 101);
        }

        printResult();

        for (Player player : players) {
            player.clearNums();
        }
    }

    private void makeMove(Player player, int targetNum, Scanner scanner) {
        enterNum(player, scanner);
        if (isGuessed(player, targetNum)) return;
        checkAttempt(player);
    }

    private void enterNum(Player player, Scanner scanner) {
        System.out.println("Вводит " + player.getName() + ": ");
        int num = scanner.nextInt();
        while (true) {
            if (num > 0 && num < 101) {
                player.setNum(num);
                return;
            }

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
        if (player.getAttempt() == attempts) {
            System.out.println("У " + player.getName() + " закончились попытки!");
        }
    }

    void printAttempts(Player player) {
        System.out.println("Ходы " + player.getName() + ":");
        for (int i : player.getNums()) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    void printResult() {
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
}