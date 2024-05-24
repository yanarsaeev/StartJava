class Calculator {
    private char sign;
    private int firstNum;
    private int secondNum;

    double result = 1.0;

    public Calculator(int firstNum, char sign, int secondNum) {
        this.firstNum = firstNum;
        this.sign = sign;
        this.secondNum = secondNum;
    }

    void calculate() {
        switch (sign) {
            case '+':
                result = firstNum + secondNum;
                break;
            case '-':
                result = firstNum - secondNum;
                break;
            case '/':
                if (secondNum == 0) {
                    System.out.println("Ошибка: деление на ноль запрещено");
                } else {
                    result = firstNum / secondNum;
                }
                break;
            case '*':
                result = firstNum * secondNum;
                break;
            case '%':
                result = firstNum % secondNum;
                break;
            case '^':
                if(secondNum > 0) {
                    result = Math.pow(firstNum, secondNum);
                } else if (secondNum < 0) {
                    secondNum = -secondNum;
                    for (int i = 0; i < secondNum; i++) {
                        result *= firstNum;
                    }
                    result = 1.0 / result;
                }
                break;
            default:
                System.out.println("Ошибка: операция \"sign\" не поддерживается");
                break;
        }
    }

    void printAnswer() {
        System.out.println("Ответ: " + result);
    }
}