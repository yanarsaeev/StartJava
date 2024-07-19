package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playerAnswer = "yes";
        while ("yes".equals(playerAnswer)) {
            System.out.print("Введите математическое выражение: ");
            String expression = scanner.nextLine();

            Calculator.calculate(expression);

            System.out.print("Хотите продолжить вычисления? [yes / no] ");
            playerAnswer = scanner.nextLine().toLowerCase();
            while (!"yes".equals(playerAnswer) && !"no".equals(playerAnswer)) {
                System.out.print("Введите корректный ответ [yes / no]: ");
                playerAnswer = scanner.nextLine().toLowerCase();
            }
        }
    }
}