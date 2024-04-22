public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        boolean isMale = true;
        if(!isMale) {
            System.out.println("Женский пол");
        } else {
            System.out.println("Мужской пол");
        }

        int age = 17;
        if(age > 18) {
            System.out.println("Welcome! Загрузка...");
        } else {
            System.out.println("Доступ только с 18-ти лет");
        }

        double length = 1.7;
        if(length > 1.8) {
            System.out.println("Ваш рост выше среднестатистического");
        } else {
            System.out.println("Ваш рост не выше среднестатистического");
        }

        char firstLetterName = "Ali".charAt(0);
        if(firstLetterName == 'M') {
            System.out.println("Имя начинается с M");
        } else if(firstLetterName == 'I') {
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
            System.exit(0);
        } else if (num < 0) {
            if (num % 2 == 0) {
                System.out.println(num + " является отрицательным и четным");
            } else {
                System.out.println(num + " является отрицательным и нечетным");
            }
        } else if (num > 0) {
            if(num % 2 == 0) {
                System.out.println(num + " является положительным и четным");
            } else {
                System.out.println(num + " является положительным и нечетным");
            }
        }

        System.out.println("\n\n4. Поиск одинаковых цифр в числах");
        int num1 = 123;
        int num2 = 223;

        int firstCategoryNum1 = num1 / 100;
        int secondCategoryNum1 = (num1 / 10) % 10;
        int thirthCategoryNum1 = num1 % 10;

        int firstCategoryNum2 = num2 / 100;
        int secondCategoryNum2 = (num2 / 10) % 10;
        int thirthCategoryNum2 = num2 % 10;

        System.out.println("Исходные числа: " + num1 + " и " + num2);

        if (firstCategoryNum1 == firstCategoryNum2) {
            System.out.println("Одинаковые цифры: " + firstCategoryNum1 + " и " + firstCategoryNum2 + " в 1-ом разряде.");
        }

        if (secondCategoryNum1 == secondCategoryNum2) {
            System.out.println("Одинаковые цифры: " + secondCategoryNum1 + " и " + secondCategoryNum2 + " во 2-ом разряде.");
        }

        if (thirthCategoryNum1 == thirthCategoryNum2) {
            System.out.println("Одинаковые цифры: " + thirthCategoryNum1 + " и " + thirthCategoryNum2 + " в 3-ем разряде.");
        }

        if(firstCategoryNum1 != firstCategoryNum2 && secondCategoryNum1 != secondCategoryNum2 && thirthCategoryNum1 != thirthCategoryNum2) {
            System.out.println("Равных цифр нет");
        }
 
        System.out.println("\n\n5. Определение символа по его коду");
        char letter = '\u0031';
        if (letter >= 'a' && letter <= 'z') {
            System.out.println("Символ " + letter + " является маленькой буквой");
        } else if(letter >= 'A' && letter <= 'Z') {
            System.out.println("Символ " + letter + " является большой буквой");
        } else if (letter >= '0' && letter <= '9') {
            System.out.println("Символ " + letter + " является цифрой");
        } else {
            System.out.println("Символ " + letter + " не является цифрой или буквой");
        }

        System.out.println("\n\n6. Подсчет суммы вклада и начисленных банком %");
        int contribution = 150000;

        if (contribution < 100000) {
            System.out.println("Сумма вклада: " + contribution + 
                    "\nСумма начисленного процента: " + (contribution * 0.05) + 
                    "\nИтоговая сумма с %: " + (contribution + (contribution * 0.05)));
        } else if (contribution >= 100000 && contribution <= 300000) {
            System.out.println("Сумма вклада: " + contribution + 
                    "\nСумма начисленного процента: " + (contribution * 0.07) + 
                    "\nИтоговая сумма с %: " + (contribution + (contribution * 0.07)));
        } else if (contribution > 300000) {
            System.out.println("Сумма вклада: " + contribution + 
                    "\nСумма начисленного процента: " + (contribution * 0.1) + 
                    "\nИтоговая сумма с %: " + (contribution + (contribution * 0.1)));
        }

        System.out.println("\n\n7. Определение оценки по предметам");
        int historyPercent = 59;
        int programmingPercent = 92;
        int historyMark = 0;
        int programmingMark = 0;

        if (historyPercent <= 60) {
            historyMark = 2;
        } else if (historyPercent > 60 && historyPercent <= 73) {
            historyMark = 3;
        } else if (historyPercent > 73 && historyPercent <= 91) {
            historyMark = 4;
        } else if (historyPercent > 91) {
             historyMark = 5;
        }

        if (programmingPercent <= 60) {
            programmingMark = 2;
        } else if (programmingPercent > 60 && programmingPercent <= 73) {
            programmingMark = 3;
        } else if (programmingPercent > 73 && programmingPercent <= 91) {
            programmingMark = 4;
        } else if (programmingPercent > 91) {
             programmingMark = 5;
        }

        System.out.println("История: " + historyMark + 
                "\nПрограммирование: " + programmingMark);
        System.out.println("Средний балл оценок по предметам: " + ((programmingMark + historyMark) / 2));
        System.out.println("Средний % по предметам: " + ((programmingPercent + historyPercent) / 2));

        System.out.println("\n\n8. Расчет годовой прибыли");
        int monthlyProductSales = 13000;
        int rentRoom = 5000;
        int costOfProduction = 9000;
        int profit = (monthlyProductSales * 12) - ((rentRoom * 12) + (costOfProduction * 12));

        if (profit >= 0) {
            System.out.println("Прибыль за год: +" + profit);
        } else {
            System.out.println("Прибыль за год: " + profit);
        }
    }
}