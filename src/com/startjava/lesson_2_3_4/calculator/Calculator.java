package com.startjava.lesson_2_3_4.calculator;

class Calculator {
    private static final int EXPRESSION_LENGTH = 3;

    public static double calculate(String expression) {
        String[] args = expression.split(" ");
        int length = args.length;

        if (length != EXPRESSION_LENGTH) throw new IllegalArgumentException("Длина строки больше 3!");

        double result = 0;
        int arg1 = 0;
        int arg2 = 0;

        try {
            arg1 = Integer.parseInt(args[0]);
            arg2 = Integer.parseInt(args[length - 1]);
        } catch (Throwable e) {
            throw new IllegalArgumentException("Одно из введенных чисел не целое!");
        }

        String sign = args[1];
        switch (sign) {
            case "+" -> result = arg1 + arg2;
            case "-" -> result = arg1 - arg2;
            case "/", "%" -> {
                if (arg2 == 0) throw new ArithmeticException("На ноль делить нельзя!");
                result = sign.equals("%") ? Math.floorMod(arg1, arg2) : (double) arg1 / arg2;
            }
            case "*" -> result = arg1 * arg2;
            case "^" -> result = Math.pow(arg1, arg2);
            default -> {
                throw new IllegalArgumentException("операция \"" + sign + "\" не поддерживается" +
                        "\nДоступны следующие операции: +, -, *, /, ^, %");
            }
        }
        return result;
    }
}