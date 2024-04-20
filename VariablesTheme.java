public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера");
        int gpuFrequency = 1552;
        System.out.println("\nЧастота видеопроцессора: " + gpuFrequency);

        long powerUnit = 1000;
        System.out.println("\nМощность БП: " + powerUnit);

        short ramSize = 64;
        System.out.println("\nОбъем оперативной памяти: " + ramSize);

        byte numCores = 8;
        System.out.println("\nКоличество ядер: " + numCores);

        float cpuFrequency = 1.6f;
        System.out.println("\nЧастота процессора: " + cpuFrequency);

        double hddSize = 500.0;
        System.out.println("\nОбъем жесткого диска: " + hddSize);

        boolean hasWaterCooling = true;
        System.out.println("\nЕсть водяное охлаждение? " + hasWaterCooling);

        System.out.println("\n\n2. Расчет стоимости товара со скидкой");
        int penPrice = 100;
        int bookPrice = 200;

        int totalCostWithoutDiscount = penPrice + bookPrice;
        int amountDiscount = totalCostWithoutDiscount * 11 / 100;
        int discountPrice = totalCostWithoutDiscount - amountDiscount;

        System.out.println("\nОбщая стоимость товаров без скидки: " + totalCostWithoutDiscount);
        System.out.println("\nСумма скидки: " + amountDiscount);
        System.out.println("\nОбщая стоимость товаров со скидкой: " + discountPrice);

        System.out.println("\n\n3. Вывод слова JAVA\n");
        System.out.println("   J    a  v     v  a\n   J   a a  v   v  a a\nJ  J  aaaaa  V V  aaaaa\n JJ  a     a  V  a     a");

        System.out.println("\n\n4. Вывод min и max значений целых числовых типов");
        int maxInt = 2147483647;
        System.out.println("\nНачальное значение maxInt: " + maxInt);
        System.out.println("Инкремент maxInt: " + ++maxInt);
        System.out.println("Декремент maxInt: " + --maxInt);

        short maxShort = 32767;
        System.out.println("\nНачальное значение maxShort: " + maxShort);
        System.out.println("Инкремент maxShort: " + ++maxShort);
        System.out.println("Декремент maxShort: " + --maxShort);

        byte maxByte = 127;
        System.out.println("\nНачальное значение maxByte: " + maxByte);
        System.out.println("Инкремент maxByte: " + ++maxByte);
        System.out.println("Декремент maxByte: " + --maxByte);

        long maxLong = 922337203685477807L;
        System.out.println("\nНачальное значение maxLong: " + maxLong);
        System.out.println("Инкремент maxLong: " + ++maxLong);
        System.out.println("Декремент maxLong: " + --maxLong);

        System.out.println("\n\n5. Перестановка значений переменных");
        int a = 2;
        int b = 5;

        System.out.println("\nИсходные значения a и b: " + a + " " + b);

        System.out.println("С помощью третьей переменной");
        int swap = a;
        a = b;
        b = swap;
        System.out.println("Значение a: " + a);
        System.out.println("Значение b: " + b);

        System.out.println("\nС помощью арифметических операций");
        a += b;
        b = a - b;
        a -= b;
        System.out.println("Значение a: " + a);
        System.out.println("Значение b: " + b);

        System.out.println("\nС помощью побитовой операции ^");
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("Значение a: " + a);
        System.out.println("Значение b: " + b);

        System.out.println("\n\n6. Вывод символов и их кодов");
        char dollar = '$'; // 36
        char asterisk = '*'; // 42
        char atSign = '@'; // 64
        char verticalBar = '|'; // 124
        char tilde = '~'; // 126

        System.out.println("\nЗнак dollar: " + dollar + ". Код: " + (int) dollar);
        System.out.println("\nЗнак asterisk: " + asterisk + ". Код: " + (int) asterisk);
        System.out.println("\nЗнак atSign: " + atSign + ". Код: " + (int) atSign);
        System.out.println("\nЗнак verticalBar: " + verticalBar + ". Код: " + (int) verticalBar);
        System.out.println("\nЗнак tilde: " + tilde + ". Код: " + (int) tilde);

        System.out.println("\n\n7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backSlach = '\\';
        char underscore = '_';
        char leftParenthesis = '(';
        char rightParenthesis = ')';

        System.out.println("    " + slash + backSlach);
        System.out.println("   " + slash + "  " + backSlach);
        System.out.println("  " + slash + underscore  + leftParenthesis + " " + rightParenthesis + backSlach);
        System.out.println(" " + slash + "      " + backSlach);
        System.out.println("" + slash + underscore + underscore + underscore + 
                underscore + slash + backSlach + underscore + underscore + backSlach);

        System.out.println("\n\n8. Вывод количества сотен, десятков и единиц числа");
        int num = 123;
        int hundred = num / 100;
        int ten = num / 10 % 10;
        int ones = num % 10;
        int sum = hundred + ten + ones;
        int product = hundred * ten * ones;
        System.out.println("Число " + num + " содержит:\n"+ 
                "  сотен - " + hundred + 
                "\n  десяток - " + ten + 
                "\n  единиц - " + ones + 
                "\nСумма его цифр = " + sum + 
                "\nПроизведение = " + product);

        System.out.println("\n\n9. Вывод времени");
        int time = 86399;
        int hour = time / 3600;
        int minute = time % 3600 / 60;
        int second = time % 60;
        System.out.println(hour + ":" + minute + ":" + second);
    }
}