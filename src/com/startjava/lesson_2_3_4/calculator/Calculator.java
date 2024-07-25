package com.startjava.lesson_2_3_4.calculator;

class Calculator {
    private static final int EXPRESSION_LENGTH = 3;

    public static double calculate(String expression) {
        String[] args = expression.split(" ");
        int length = args.length;

        if (length != EXPRESSION_LENGTH) {
            try {
                throw new RuntimeException();
            } catch (RuntimeException e) {
                System.out.println("Длина выражения не равна 3!");
                return Double.NaN;
            }
        }

        double result;
        int arg1;
        int arg2;

        try {
            arg1 = Integer.parseInt(args[0]);
            arg2 = Integer.parseInt(args[length - 1]);
        } catch (RuntimeException e) {
            System.out.println("Одно из введённых чисел не целое");
            return Double.NaN;
        }

        String sign = args[1];

        switch (sign) {
            case "+" -> result = arg1 + arg2;
            case "-" -> result = arg1 - arg2;
            case "/", "%" -> {
                if (arg2 == 0) {
                    System.out.println("На ноль делить нельзя!");
                    return Double.NaN;
                }
                result = sign.equals("%") ? Math.floorMod(arg1, arg2) : (double) arg1 / arg2;
            }
            case "*" -> result = arg1 * arg2;
            case "^" -> result = Math.pow(arg1, arg2);
            default -> {
                System.out.println("Ошибка: операция \"" + sign + "\" не поддерживается" +
                        "\nДоступны следующие операции: +, -, *, /, ^, %");
                return Double.NaN;
            }
        }
        return result;
    }
}