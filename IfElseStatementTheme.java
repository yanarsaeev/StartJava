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

        char firstLetterName = "Magomed".charAt(0);
        if(firstLetterName == 'M') {
            
        } else if(firstLetterName == 'I') {

        } else {
            System.out.println("Имя НЕ начинается на буквы M или I.");
        }