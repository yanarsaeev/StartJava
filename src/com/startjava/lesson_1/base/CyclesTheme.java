package com.startjava.lesson_1.base;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int startSegment = -10;
        int endSegment = 21;
        int sumEvenNums = 0;
        int sumOddNums = 0;

        System.out.print("В отрезке [" + startSegment + ", " + endSegment + "]");
        do {
            if (startSegment % 2 == 0) {
                sumEvenNums += startSegment;
            } else {
                sumOddNums += startSegment;
            }
            startSegment++;
        } while (startSegment <= endSegment);

        System.out.println(" сумма четных чисел = " + sumEvenNums + ", а нечетных = " + sumOddNums);

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

        System.out.print("Вывод чисел из интервала (" + min + ", " + max + "): ");
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int num = 1234;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            System.out.print(digit);
            sum += digit;
            num /= 10;
        }
        System.out.println(sum);

        System.out.println("\n\n4. Вывод чисел в несколько строк");
        int numsInLine = 0;
        for (int i = 1; i < 24; i += 2) {
            if (numsInLine % 5 == 0) {
                System.out.println();
            }
            System.out.printf("%4d", i);
            numsInLine++;
        }

        if (numsInLine % 5 != 0) {
            int remainder = 5 - numsInLine % 5;
            for (int i = 0; i < remainder; i++) {
                System.out.printf("%4d", 0);
            }
        }

        System.out.println("\n\n5. Проверка количества двоек числа на четность/нечетность");
        num = 3242592;
        int twosCount = 0;

        int numCopy = num;
        while (numCopy > 0) {
            if (numCopy % 10 == 2) {
                twosCount++;
            }
            numCopy /= 10;
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

        int lines = 5;
        while (lines > 0) {
            int rows = 0;
            while (rows < lines) {
                System.out.print("#");
                rows++;
            }
            System.out.println();
            lines--;
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
        for (int i = 33; i < 48; i += 2) {
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

        String state = (reverseNum == palindromeCopy) ? "является" : "не является";
        System.out.println("Число " + palindromeCopy + " " + state + " палиндромом");

        System.out.println("\n\n9. Проверка, является ли число счастливым");
        int luckyNum = 455456;

        int leftHalf = luckyNum / 1000;
        int rightHalf = luckyNum % 1000;
        
        int sumLeftHalf = 0;
        int sumRightHalf = 0;
        for (int i = 0; i < 3; i++) {
            sumLeftHalf += leftHalf % 10;
            leftHalf /= 10;

            sumRightHalf += rightHalf % 10;
            rightHalf /= 10;
        }

        String sumForConsole = "\nСумма " + (luckyNum / 1000) + " = " + sumLeftHalf + 
                ", а сумма " + (luckyNum % 1000) + " = " + sumRightHalf;

        state = (sumLeftHalf == sumRightHalf) ? "является" : "не является";
        System.out.println("Число " + luckyNum + " " + state + " счастливым" + sumForConsole);

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