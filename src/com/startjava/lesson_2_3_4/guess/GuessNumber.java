package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
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
        int firstPlayerAttempts = 0;
        int secondPlayerAttempts = 0;
        int attempts = 10;
        System.out.println("Игра началась! У каждого игрока по " + attempts + " попыток.");
        Random r = new Random();
        int targetNum = r.nextInt(1, 101);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Вводит " + player1.getName() + " (игрок1): ");
            int firstPlayerNum = scanner.nextInt();
            player1.setNum(firstPlayerNum);
            firstPlayerAttempts++;
            if (firstPlayerAttempts == attempts) {
                System.out.println("У " + player1.getName() + " закончились попытки!");
                Arrays.fill(player1.getNums(), 0, firstPlayerAttempts, 0);
                break;
            }
            String comparisonResult = "";
            if (player1.getNum() == targetNum) {
                System.out.println(player1.getName() + " угадал число " + firstPlayerNum + " с " +
                        firstPlayerAttempts + "-й попытки!");
                System.out.println(Arrays.toString(Arrays.copyOf(player1.getNums(), firstPlayerAttempts)));
                Arrays.fill(player1.getNums(), 0, firstPlayerAttempts, 0);
                break;
            }

            if (player1.getNum() > targetNum) {
                comparisonResult = "больше";
            } else if (player1.getNum() < targetNum) {
                comparisonResult = "меньше";
            }

            System.out.println("Число " + player1.getNum() + 
                    " " + comparisonResult + " того, что загадал компьютер");

            System.out.println("Вводит " + player2.getName() + " (игрок2): ");
            int secondPlayerNum = scanner.nextInt();
            player2.setNum(secondPlayerNum);
            secondPlayerAttempts++;
            if (secondPlayerAttempts == attempts) {
                System.out.println("У " + player2.getName() + " закончились попытки!");
                Arrays.fill(player2.getNums(), 0, secondPlayerAttempts, 0);
                break;
            }
            if (player2.getNum() == targetNum) {
                System.out.println(player2.getName() + " угадал число " + secondPlayerNum + " с " +
                        secondPlayerAttempts + "-й попытки!");
                System.out.println(Arrays.toString(Arrays.copyOf(player2.getNums(), secondPlayerAttempts)));
                Arrays.fill(player2.getNums(), 0, secondPlayerAttempts, 0);
                break;
            }

            if (player2.getNum() > targetNum) {
                comparisonResult = "больше";
            } else if (player2.getNum() < targetNum) {
                comparisonResult = "меньше";
            }

            System.out.println("Число " + player2.getNum() + 
                    " " + comparisonResult + " того, что загадал компьютер");
        }
    }
}