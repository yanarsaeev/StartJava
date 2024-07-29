package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private final Player[] players = new Player[3];
    private final int attempts = 10;

    GuessNumber(String name1, String name2, String name3) {
        players[0] = new Player(name1);
        players[1] = new Player(name2);
        players[2] = new Player(name3);
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
        int firstPlayerCounter = 0;
        int secondPlayerCounter = 0;
        int thirdPlayerCounter = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.println("ROUND " + i);
            for (int j = 1; j <= attempts; j++) {
                players[0].setAttempt(j);
                makeMove(players[0], targetNum, scanner);
                if (players[0].getNum() == targetNum) {
                    firstPlayerCounter++;
                    break;
                }

                players[1].setAttempt(j);
                makeMove(players[1], targetNum, scanner);
                if (players[1].getNum() == targetNum) {
                    secondPlayerCounter++;
                    break;
                }

                players[2].setAttempt(j);
                makeMove(players[2], targetNum, scanner);
                if (players[2].getNum() == targetNum) {
                    thirdPlayerCounter++;
                    break;
                }
            }
            if (players[0].getNum() != targetNum &&
                    players[1].getNum() != targetNum &&
                    players[2].getNum() != targetNum) {
                System.out.println("Никто не угадал число: " + targetNum);
            }

            printAttempts(players[0]);
            printAttempts(players[1]);
            printAttempts(players[2]);

            System.out.println();
            targetNum = random.nextInt(1, 101);
        }

        printResult(firstPlayerCounter, secondPlayerCounter, thirdPlayerCounter);
        players[0].clearNums();
        players[1].clearNums();
        players[2].clearNums();
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

    void printResult(int counter1, int counter2, int counter3) {
        if (counter1 == counter2 && counter2 == counter3) {
            System.out.println("По результатам 3-х раундов - НИЧЬЯ!");
            if (counter1 == 0) {
                System.out.println("Никто не угадал даже одно число. Вы все проиграли!");
            }
            return;
        }

        System.out.print("По итогу 3-х раундов - ВЫИГРАЛ ");
        if (counter1 > counter2 && counter1 > counter3) {
            System.out.println(players[0].getName());
        } else if (counter2 > counter1 && counter2 > counter3) {
            System.out.println(players[1].getName());
        } else if (counter3 > counter1 && counter3 > counter2) {
            System.out.println(players[2].getName());
        }
    }
}