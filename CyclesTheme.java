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
    }
}