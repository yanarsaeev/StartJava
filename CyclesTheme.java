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
        int oddNumsCounter = 0;
        for (int i = 1; i < 24; i += 2) {
            if (oddNumsCounter % 5 == 0) {
                System.out.println();
            }
            System.out.print(i + " ");
            oddNumsCounter++;
        }

        if (oddNumsCounter % 5 != 0) {
            int remaining = 5 - oddNumsCounter % 5;
            for (int i = 0; i < remaining; i++) {
                System.out.print("0 ");
            }
        }

        System.out.println("\n\n5. Проверка количества двоек числа на четность/нечетность");
        

        System.out.println("\n\n6. Отображение геометрических фигур");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        int counter = 5;
        while (counter > 0) {
            int nestedCounter = 0;
            while (nestedCounter < counter) {
                System.out.print("#");
                nestedCounter++;
            }
            System.out.println();
            counter--;
        }
        System.out.println();

        int firstHalfOfTriangle = 1;
        do {
            int nestedCounter = 0;
            do {
                System.out.print("$");
            } while (++nestedCounter < firstHalfOfTriangle);
            System.out.println();
        } while (firstHalfOfTriangle++ < 3);

        int secondHalfOfTheTriangle = 2;
        do {
            int nestedCounter = 0;
            do {
                System.out.print("$");
            } while (++nestedCounter < secondHalfOfTheTriangle);
            System.out.println();
        } while (--secondHalfOfTheTriangle > 0);
    }
}