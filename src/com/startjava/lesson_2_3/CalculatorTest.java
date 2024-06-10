import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playerAnswer = "yes";
        while (playerAnswer.equals("yes")) {
            System.out.println("Введите первое число: ");
            int arg1 = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Введите знак математической операции: ");
            char sign = scanner.nextLine().charAt(0);
            System.out.println("Введите второе число: ");
            int arg2 = scanner.nextInt();
            scanner.nextLine();

            Calculator calculator = new Calculator(arg1, sign, arg2);
            calculator.calculate();

            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]");
                playerAnswer = scanner.next();
            } while (!"yes".equals(playerAnswer) && !"no".equals(playerAnswer));
        }
    }
}