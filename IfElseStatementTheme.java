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
    }
}