package com.startjava.lesson_2_3_4.calculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userAnswer = "yes";
        while (!"no".equals(userAnswer)) {
            if ("yes".equals(userAnswer)) {
                System.out.print("Введите математическое выражение: ");
                String expression = scanner.nextLine().trim().replaceAll("\\s{2,}", " ");

                double result = Calculator.calculate(expression);
                
                if (Double.isNaN(result)) {
                    continue;
                }

                printResult(expression, result);
            } else {
                System.out.print("Введите корректный ответ [yes / no]: ");
            }
            userAnswer = scanner.nextLine().toLowerCase();
        }
    }

    public static void printResult(String expression, double result) {
        String[] divisionParts = expression.split(" ");
        DecimalFormat decimalFormat = new DecimalFormat("0.###");
        System.out.println(divisionParts[0] + " " + divisionParts[1] +
                " " + divisionParts[divisionParts.length - 1] + " = " + decimalFormat.format(result));
        System.out.print("Хотите продолжить вычисления? [yes / no] ");
    }
}