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
                String expression = scanner.nextLine().trim().replaceAll("\\s+", " ");

                double result;

                try {
                    result = Calculator.calculate(expression);
                    printResult(expression, result);
                } catch (Exception e) {
                    System.out.println("Ошибка: " + e.getMessage());
                }

                System.out.print("Хотите продолжить вычисления? [yes / no] ");
            } else {
                System.out.print("Введите корректный ответ [yes / no]: ");
            }
            userAnswer = scanner.nextLine().toLowerCase();
        }
    }

    public static void printResult(String expression, double result) {
        DecimalFormat df = new DecimalFormat("0.###");
        System.out.println(expression + " = " + df.format(result));
    }
}