public class Calculator {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        char sign = '+';
        int result = 0;

        if (a >= 0 && b >= 0) {
            if (sign == '+') {
                result = a + b;
            } else if (sign == '-') {
                result = a - b;
            } else if (sign == '*') {
                result = a * b;
            } else if (sign == '/') {
                result = a / b;
            } else if (sign == '%') {
                result = a % b;
            } else if (sign == '^') {
                result = 1;
                for (int i = 0; i < b; i++) {
                    result *= a;
                }
            }
        } else {
            System.out.println("Калькулятор работает только с положительными числами");
        }

        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}