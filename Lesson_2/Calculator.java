class Calculator {
    private char sign;
    private int arg1;
    private int arg2;

    public Calculator(int arg1, char sign, int arg2) {
        this.arg1 = arg1;
        this.sign = sign;
        this.arg2 = arg2;
    }

    void calculate() {
        double result = 1.0;
        String res = arg1 + " " + sign + " " + arg2 + " = ";
        switch (sign) {
            case '+':
                result = arg1 + arg2;
                break;
            case '-':
                result = arg1 - arg2;
                break;
            case '/':
                if (arg2 == 0) {
                    System.out.println("Ошибка: деление на ноль запрещено");
                } else {
                    result = arg1 / arg2;
                }
                break;
            case '*':
                result = arg1 * arg2;
                break;
            case '%':
                if (arg2 == 0) {
                    System.out.println("Ошибка: деление на ноль запрещено");
                } else {
                    result = arg1 % arg2;
                }
                break;
            case '^':
                raiseToPower();
                break;
            default:
                System.out.println("Ошибка: операция \"" + sign + "\" не поддерживается" +
                        "\nДоступны следующие операции: +, -, *, /, ^, %");
                break;
        }

        if (sign != '^') {
            res += raiseToPower();
        } else {
            res += result;
        }

        System.out.println(res);
    }

    double raiseToPower() {
        double result = 1.0;
        for (int i = 0; i < Math.abs(arg2); i++) {
            result *= arg1;
        }
        result = (arg2 < 0) ? (1.0 / result) : result;
        return result;
    }
}