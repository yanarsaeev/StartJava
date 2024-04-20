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
        int num = 77;
        if (num == 0) {
            System.out.println("Число 0");
            System.exit(0);
        }
    }
}