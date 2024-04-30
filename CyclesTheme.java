public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int a = -10;
        int b = 21;
        int evenNums = 0;
        int oddNums = 0;
        do {
            if (a % 2 == 0) {
                evenNums += a;
            } else {
                oddNums += a;
            }
            a++;
        } while (a <= b);
        System.out.println("В отрезке [-10; 21] сумма четных чисел = " + 
                evenNums + ", а нечетных = " + oddNums);

        System.out.println("\n\n2. Вывод чисел в порядке убывания");
        int num1 = 10;
        int num2 = -1;
        int num3 = 5;

        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }

        int min = num1;
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }

        for (int i = max; i >= min; i--) {
            System.out.println(i);
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int num = 1234;
        int sum = 0;
        while (num > 0) {
            System.out.println(num % 10);
            sum += num % 10;
            num /= 10;
        }
        System.out.println(sum);

        System.out.println("\n\n4. Вывод чисел в несколько строк");
        for (int i = 1; i < 24; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}