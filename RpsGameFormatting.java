import java.util.Random;

public class RpsGameFormatting {
    public static void main(String[] args) throws InterruptedException {
        String rock = "R";
        String scissors = "S";
        String paper = "P";

        String firstPlayer = "HEL";
        Random random = new Random();
        int firstPlayerPosition = random.nextInt(1, 100);
        String firstPlayerSign = rock;

        if (firstPlayerPosition > 66) {
            firstPlayerSign = paper;
        } else if (firstPlayerPosition > 33) {
            firstPlayerSign = scissors;
        }

        System.out.println("Ход " + firstPlayer + ": ");

        for (int i = 0; i < 5; i++) {
            System.out.print(rock + "\r");
            Thread.sleep(100);
            System.out.print(scissors + "\r");
            Thread.sleep(100);
            System.out.print(paper + "\r");
            Thread.sleep(100);
        }

        System.out.println(firstPlayerSign);

        String secondPlayer = "WALLE";
        int secondPlayerPosition = random.nextInt(1, 100);
        String secondPlayerSign = rock;

        if (secondPlayerPosition > 66) {
            secondPlayerSign = paper;
        } else if (secondPlayerPosition > 33) {
            secondPlayerSign = scissors;
        }

        System.out.println("Ход " + secondPlayer + ": ");

        for (int i = 0; i < 5; i++) {
            System.out.print(rock + "\r");
            Thread.sleep(100);
            System.out.print(scissors + "\r");
            Thread.sleep(100);
            System.out.print(paper + "\r");
            Thread.sleep(100);
        }

        System.out.println(secondPlayerSign);


        if (firstPlayerSign.equals(secondPlayerSign)) {
            System.out.println("Победила дружба!");
            return;
        }

        boolean isEqualName1 = firstPlayerSign.equals(rock) && secondPlayerSign.equals(scissors) ||
                firstPlayerSign.equals(scissors) && secondPlayerSign.equals(paper) ||
                firstPlayerSign.equals(paper) && secondPlayerSign.equals(rock);

        if (isEqualName1) {
            System.out.println("\nПобедил - " + firstPlayer);
        } else {
            System.out.println("\nПобедил - " + secondPlayer);
        }
    }
}