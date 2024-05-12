public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int startSegment = -10;
        int startSegmentCopy = startSegment;
        int endSegment = 21;
        int evenNumsSum = 0;
        int oddNumsSum = 0;
        do {
            if (startSegment % 2 == 0) {
                evenNumsSum += startSegment;
            } else {
                oddNumsSum += startSegment;
            }
            startSegment++;
        } while (startSegment <= endSegment);
        System.out.println("В отрезке [" + startSegmentCopy + ", " + endSegment + "] сумма четных чисел = " + 
                evenNumsSum + ", а нечетных = " + oddNumsSum);

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

        System.out.print("Вывод чисел из интервала [" + min + ", " + max + "]: ");
        for (int i = max; i >= min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int num = 1234;
        int sum = 0;
        while (num > 0) {
            System.out.print(num % 10); // НУЖНО ИСПРАВИТЬ !!!
            sum += num % 10;
            num /= 10;
        }
        System.out.println(sum);

        System.out.println("\n\n4. Вывод чисел в несколько строк");
        int oddNumsInLine = 0;
        for (int i = 1; i < 24; i += 2) {
            if (oddNumsInLine % 5 == 0) {
                System.out.println();
            }
            System.out.printf("%4d", i);
            oddNumsInLine++;
        }

        if (oddNumsInLine % 5 != 0) {
            int remainder = 5 - oddNumsInLine % 5;
            for (int i = 0; i < remainder; i++) {
                System.out.printf("%4d", 0);
            }
        }

        System.out.println("\n\n5. Проверка количества двоек числа на четность/нечетность");
        num = 3242592;
        int twosCount = 0;

        int countDigitsOnNum = 7;
        int desiredNumCopy = num;
        while (countDigitsOnNum > 0) {
            int nestedCounter = desiredNumCopy % 10;
            desiredNumCopy /= 10;
            if (nestedCounter == 2) {
                twosCount++;
            }
            countDigitsOnNum--;
        }

        if (twosCount % 2 == 0) {
            System.out.println("В " + num + " четное количество двоек - " + twosCount);
        } else {
            System.out.println("В " + num + " нечетное количество двоек " + twosCount);
        }

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

        int linesCount = 0;
        int spaces = 2; 

        do {
            int j = 3;
            do {
                if (j > spaces) {
                    System.out.print("$");
                } else {
                    System.out.print(" ");
                }
                j--;
            } while (j > 0);

            System.out.println();

            if (linesCount < 2) { 
                spaces--;
            } else { 
                spaces++;
            }
            linesCount++;
        } while (linesCount < 5);

        System.out.println("\n\n7. Отображение ASCII-символов");
        System.out.println("DECIMAL   CHARACTER   DESCRIPTION");
        for (int i = 33; i < 46; i += 2) {
            System.out.printf("%4d%11c           %-11s%n", i, (char) i, Character.getName(i));
        }

        for (int i = 98; i < 123; i += 2) {
            System.out.printf("%4d%11c           %-11s%n", i, (char) i, Character.getName(i));
        }

        System.out.println("\n\n8. Проверка, является ли число палиндромом");
        int palindrome = 1234321;
        int palindromeCopy = palindrome;
        int reverseNum = 0;
        while (palindrome > 0) {
            reverseNum = reverseNum * 10 + palindrome % 10;
            palindrome /= 10;
        }
        System.out.println(reverseNum == palindromeCopy ? 
                "число " + palindromeCopy + " является палиндромом" : 
                "число " + palindromeCopy + " не является палиндромом");

        System.out.println("\n\n9. Проверка, является ли число счастливым");
        int luckyNum = 456456;

        int firstHalfSum = 0;
        int secondHalfSum = 0;
        for (int i = 0; i < 6; i++) {
            int digit = (luckyNum / (int) Math.pow(10, i)) % 10;
            if (i < 3) {
                secondHalfSum += digit;
            } else {
                firstHalfSum += digit;
            }
        }

        if (firstHalfSum == secondHalfSum) {
            System.out.println("Число " + luckyNum + " является счастливым" + 
                    "\nСумма " + (luckyNum / 1000) + " = " + firstHalfSum + 
                    ", а сумма " + (luckyNum % 1000) + " = " + secondHalfSum);
        } else {
            System.out.println("Число " + luckyNum + " не является счастливым" + 
                    "\nСумма " + (luckyNum / 1000) + " = " + firstHalfSum + 
                    ", а сумма " + (luckyNum % 1000) + " = " + secondHalfSum);
        }

        System.out.println("\n\n10. Отображение таблицы умножения Пифагора");
        for (int i = 1; i < 10; i++) {
            if (i == 1) {
                System.out.print("   ");
            } else if (i > 1) {
                System.out.printf("%4d", i);
            }
        }
        System.out.println("\n------------------------------------");


        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (j > 1) {
                    System.out.printf("%4d", i * j);
                } else if (j == 1) {
                    System.out.print(i + " |");
                }
            }
            System.out.println();
        }
    }
}