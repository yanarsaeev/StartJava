package com.startjava.lesson_2_3_4.calculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playerAnswer = "yes";
        while (true) {
            if ("yes".equals(playerAnswer)) {
                System.out.print("Введите математическое выражение: ");

                String[] expression = scanner
                        .nextLine().trim()
                        .replaceAll("\\s{2,}", " ").split(" ");

                double result = Calculator.calculate(expression);

                DecimalFormat decimalFormat;
                if (result == 0.0) {
                    decimalFormat = new DecimalFormat("0.#");
                } else {
                    decimalFormat = new DecimalFormat("0.###");
                }

                if (Double.isNaN(result)) {
                    continue;
                }

                System.out.println(expression[0] + " " + expression[1] +
                        " " + expression[expression.length - 1] + " = " + decimalFormat.format(result));
                System.out.print("Хотите продолжить вычисления? [yes / no] ");
                playerAnswer = scanner.nextLine().toLowerCase();
            } else if ("no".equals(playerAnswer)) {
                break;
            } else {
                System.out.print("Введите корректный ответ [yes / no]: ");
                playerAnswer = scanner.nextLine().toLowerCase();
            }
        }
    }
}