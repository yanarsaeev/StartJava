import java.math.*;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        boolean isMale = true;
        if (!isMale) {
            System.out.println("Женский пол");
        } else {
            System.out.println("Мужской пол");
        }

        int age = 17;
        if (age > 18) {
            System.out.println("Welcome! Загрузка...");
        } else {
            System.out.println("Доступ только с 18-ти лет");
        }

        double length = 1.7;
        if (length > 1.8) {
            System.out.println("Ваш рост выше среднестатистического");
        } else {
            System.out.println("Ваш рост не выше среднестатистического");
        }

        char firstLetterName = "Ali".charAt(0);
        if (firstLetterName == 'M') {
            System.out.println("Имя начинается с M");
        } else if (firstLetterName == 'I') {
            System.out.println("Имя начинается с I");
        } else {
            System.out.println("Имя НЕ начинается на буквы M или I.");
        }

        System.out.println("\n\n2. Поиск большего числа");
        int a = 10;
        int b = 5;

        if (a > b) {
            System.out.println(a + " больше " + b);
        } else if (a < b) {
            System.out.println(a + " меньше " + b);
        } else {
            System.out.println("Числа равны");
        }

        System.out.println("\n\n3. Проверка числа");
        int num = -12;
        if (num == 0) {
            System.out.println("Число 0");
        } else {
            if (num % 2 == 0) {
                System.out.print(num + " является четным ");
            } else {
                System.out.print(num + " является нечетным ");
            }
            if (num > 0) {
                System.out.println("и положительным");
            } else {
                System.out.println("и отрицательным");
            }
        }

        System.out.println("\n\n4. Поиск одинаковых цифр в числах");
        int num1 = 123;
        int num2 = 223;

        System.out.println("Исходные числа: " + num1 + " и " + num2);

        int onesInNum1 = num1 / 100;
        int tensInNum1 = (num1 / 10) % 10;
        int hundredsInNum1 = num1 % 10;

        int onesInNum2 = num2 / 100;
        int tensInNum2 = (num2 / 10) % 10;
        int hundredsInNum2 = num2 % 10;

        if (onesInNum1 != onesInNum2 && tensInNum1 != tensInNum2 && hundredsInNum1 != hundredsInNum2) {
            System.out.println("Равных цифр нет");
        } else {
            if (onesInNum1 == onesInNum2) {
                System.out.println("Одинаковые цифры: " + onesInNum1 + 
                        " и " + onesInNum2 + " в 1-ом разряде.");
            }
            if (tensInNum1 == tensInNum2) {
                System.out.println("Одинаковые цифры: " + tensInNum1 + 
                        " и " + tensInNum2 + " в 1-ом разряде.");
            }
            if (hundredsInNum1 == hundredsInNum2) {
                System.out.println("Одинаковые цифры: " + hundredsInNum1 + 
                        " и " + hundredsInNum2 + " в 1-ом разряде.");
            } 
        }
 
        System.out.println("\n\n5. Определение символа по его коду");
        char unknownChar = '\u0031';
        if (unknownChar >= 'a' && unknownChar <= 'z') {
            System.out.println("Символ " + unknownChar + " является маленькой буквой");
        } else if (unknownChar >= 'A' && unknownChar <= 'Z') {
            System.out.println("Символ " + unknownChar + " является большой буквой");
        } else if (unknownChar >= '0' && unknownChar <= '9') {
            System.out.println("Символ " + unknownChar + " является цифрой");
        } else {
            System.out.println("Символ " + unknownChar + " не является цифрой или буквой");
        }

        System.out.println("\n\n6. Подсчет суммы вклада и начисленных банком %");
        BigDecimal contribution = new BigDecimal("321123.59");
        BigDecimal percent = new BigDecimal("0.05");

        if (contribution.compareTo(new BigDecimal("100000")) >= 0 && 
                contribution.compareTo(new BigDecimal("300000")) <= 0) {
            percent = new BigDecimal("0.07");
        } else if (contribution.compareTo(new BigDecimal("300000")) > 0) {
            percent = new BigDecimal("0.1");
        }

        System.out.println("Сумма вклада: " + contribution + 
                "\nСумма начисленного процента: " + 
                contribution.multiply(percent).setScale(2, RoundingMode.HALF_UP) +
                "\nИтоговая сумма с %: " + 
                contribution.add(contribution.multiply(percent)).setScale(2, RoundingMode.HALF_UP));

        System.out.println("\n\n7. Определение оценки по предметам");
        int historyPercent = 59;
        int historyMark = 2;
        if (historyPercent > 60 && historyPercent <= 73) {
            historyMark = 3;
        } else if (historyPercent > 73 && historyPercent <= 91) {
            historyMark = 4;
        } else if (historyPercent > 91) {
            historyMark = 5;
        }

        int programmingPercent = 92;
        int programmingMark = 2;
        if (programmingPercent > 60 && programmingPercent <= 73) {
            programmingMark = 3;
        } else if (programmingPercent > 73 && programmingPercent <= 91) {
            programmingMark = 4;
        } else if (programmingPercent > 91) {
            programmingMark = 5;
        }

        System.out.println("История: " + historyMark + "\nПрограммирование: " + programmingMark);
        System.out.println("Средний балл оценок по предметам: " + 
                (double) (programmingMark + historyMark) / 2);
        System.out.println("Средний % по предметам: " + 
                (double) (programmingPercent + historyPercent) / 2);

        System.out.println("\n\n8. Расчет годовой прибыли");
        BigDecimal monthlyRevenue = new BigDecimal("13025.233");
        BigDecimal monthlyRent = new BigDecimal("5123.018");
        BigDecimal monthlyCostOfProduction = new BigDecimal("9001.729");

        BigDecimal annualProfit = monthlyRevenue.subtract(monthlyRent)
                .subtract(monthlyCostOfProduction)
                .multiply(new BigDecimal("12"))
                .setScale(2, RoundingMode.HALF_UP);

        if (annualProfit.compareTo(BigDecimal.ZERO) > 0) {
            System.out.println("Прибыль за год: +" + annualProfit);
        } else {
            System.out.println("Прибыль за год: " + annualProfit);
        }
    }
}