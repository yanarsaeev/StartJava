class Calculator {
    private char sign;
    private int arg1;
    private int arg2;

    double result = 1.0;

    public Calculator(int arg1, char sign, int arg2) {
        this.arg1 = arg1;
        this.sign = sign;
        this.arg2 = arg2;
    }

    void calculate() {
        switch (sign) {
            case '+':
                result = arg1 + arg2;
                printResult();
                break;
            case '-':
                result = arg1 - arg2;
                printResult();
                break;
            case '/':
                if (arg2 == 0) {
                    System.out.println("Ошибка: деление на ноль запрещено");
                } else {
                    result = arg1 / arg2;
                }
                printResult();
                break;
            case '*':
                result = arg1 * arg2;
                printResult();
                break;
            case '%':
                result = arg1 % arg2;
                printResult();
                break;
            case '^':
                if (arg2 > 0) {
                    for (int i = 0; i < arg2; i++) {
                        result *= arg1;
                    }
                } else if (arg2 < 0) {
                    arg2 = -arg2;
                    for (int i = 0; i < arg2; i++) {
                        result *= arg1;
                    }
                    result = 1.0 / result;
                }
                printResult();
                break;
            default:
                System.out.println("Ошибка: операция \"" + sign + "\" не поддерживается");
                break;
        }
    }

    void printResult() {
        System.out.println("Ответ: " + result);
    }
}