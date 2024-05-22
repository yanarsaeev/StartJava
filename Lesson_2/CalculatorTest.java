import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите первое число:");
            int firstNum = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Введите знак математической операции:");
            char sign = scanner.nextLine().charAt(0);
            System.out.println("Введите второе число:");
            int secondNum = scanner.nextInt();
            scanner.close();

            Calculator expression1 = new Calculator(firstNum, sign, secondNum);
            expression1.calculate();
            expression1.printAnswer();
        } while ();
    }
}