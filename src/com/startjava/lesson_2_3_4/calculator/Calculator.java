package com.startjava.lesson_2_3_4.calculator;

class Calculator {
    private static final int EXPRESSION_LENGTH = 3;

    public static double calculate(String[] expression) {
        int length = expression.length;

        if (length != EXPRESSION_LENGTH) {
            try {
                throw new RuntimeException();
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }

        double result = 1.0;
        for (int i = 0; i < length; i++) {
            int arg1 = 0;
            int arg2 = 0;

            try {
                arg1 = Integer.parseInt(expression[0]);
                arg2 = Integer.parseInt(expression[length - 1]);
            } catch (RuntimeException e) {
                System.out.println("Одно из введеных чисел не целое");
            }

            String sign = expression[1];
            switch (sign) {
                case "+" -> result = arg1 + arg2;
                case "-" -> result = arg1 - arg2;
                case "/" -> {
                    if (arg2 == 0) {
                        try {
                            throw new RuntimeException();
                        } catch (RuntimeException e) {
                            System.out.println("На ноль делить нельзя");
                            return Double.NaN;
                        }
                    }
                    result = (double) arg1 / arg2;
                }
                case "*" -> result = arg1 * arg2;
                case "^" -> result = Math.pow(arg1, arg2);
                case "%" -> result = Math.floorMod(arg1, arg2);
                default -> {
                    System.out.println("Ошибка: операция \"" + sign + "\" не поддерживается" +
                            "\nДоступны следующие операции: +, -, *, /, ^, %");
                    return Double.NaN;
                }
            }
        }
        return result;
    }
}