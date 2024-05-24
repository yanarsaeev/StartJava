import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введите первое число:");
            int firstNum = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Введите знак математической операции:");
            char sign = scanner.nextLine().charAt(0);
            System.out.println("Введите второе число:");
            int secondNum = scanner.nextInt();
            scanner.nextLine();
            Calculator expression1 = new Calculator(firstNum, sign, secondNum);
            expression1.calculate();
            expression1.printAnswer();

            boolean isRepeat = true;
            while (true) {
                System.out.println("Хотите продолжить вычисления? [yes/no]");
                String repeat = scanner.nextLine();
                if (repeat.equals("yes")) {
                    break;
                } else if (repeat.equals("no")) {
                    isRepeat = false;
                    break;
                }
            }

            if (isRepeat == false) {
                break;
            }
        } while (true);
    }
}