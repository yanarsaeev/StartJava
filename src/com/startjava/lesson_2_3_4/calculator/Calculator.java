package com.startjava.lesson_2_3_4.calculator;

import java.text.DecimalFormat;

class Calculator {
    private static String[] expression;
    private static final int EXPRESSION_LENGTH = 3;

    static void calculate(String exp) {
        Calculator.expression = exp.trim().replaceAll("\\s{2,}", " ").split(" ");
        int length = Calculator.expression.length;

        if (EXPRESSION_LENGTH != length) {
            try {
                throw new RuntimeException();
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
                return;
            }
        }

        double result = 1.0;
        String strResult = "";
        for (int i = 0; i < length; i++) {
            int arg1 = 0;
            int arg2 = 0;
            try {
                arg1 = Integer.parseInt(expression[0]);
                arg2 = Integer.parseInt(expression[length - 1]);
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
                return;
            }
            String sign = expression[1];
            switch (sign) {
                case "+" -> result = arg1 + arg2;
                case "-"-> result = arg1 - arg2;
                case "/" -> {
                    if (arg2 == 0) {
                        try {
                            throw new RuntimeException();
                        } catch (RuntimeException e) {
                            System.out.println(e.getMessage());
                            return;
                        }
                    }
                    result = (double) arg1 / arg2;
                }
                case "*" -> result = arg1 * arg2;
                case "^" -> result = Math.pow(arg1, arg2);
                case "%" -> result = Math.floorMod(arg1, arg2);
                default ->
                    System.out.println("Ошибка: операция \"" + sign + "\" не поддерживается" +
                            "\nДоступны следующие операции: +, -, *, /, ^, %");
            }
            DecimalFormat decimalResult = new DecimalFormat("0.#");
            strResult = arg1 + " " + sign + " " + arg2 + " = " + decimalResult.format(result);
        }
        System.out.println(strResult);
    }
}