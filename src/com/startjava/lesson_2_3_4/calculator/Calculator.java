package com.startjava.lesson_2_3_4.calculator;

import java.text.DecimalFormat;

class Calculator {
    private final String[] expression;

    public Calculator(String expression) {
        this.expression = expression.split(" ");
    }

    void calculate() {
        double result = 1.0;
        String strResult = "";
        for (int i = 0; i < expression.length; i++) {
            int arg1 = Integer.parseInt(expression[0]);
            int arg2 = Integer.parseInt(expression[expression.length - 1]);
            String sign = expression[1];
            switch (sign) {
                case "+":
                    result = arg1 + arg2;
                    break;
                case "-":
                    result = arg1 - arg2;
                    break;
                case "/":
                    if (arg2 == 0) {
                        System.out.println("Ошибка: Деление на ноль запрещено");
                        return;
                    }
                    result = (double) arg1 / arg2;
                    break;
                case "*":
                    result = arg1 * arg2;
                    break;
                case "^":
                    result = Math.pow(arg1, arg2);
                    break;
                case "%":
                    result = Math.floorMod(arg1, arg2);
                    break;
                default:
                    System.out.println("Ошибка: операция \"" + sign + "\" не поддерживается" +
                            "\nДоступны следующие операции: +, -, *, /, ^, %");
                    return;
            }
            DecimalFormat decimalResult = new DecimalFormat("0.#");
            strResult = arg1 + " " + sign + " " + arg2 + " = " + decimalResult.format(result);
        }
        System.out.println(strResult);
    }
}