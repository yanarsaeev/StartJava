import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    void start() {
        Random r = new Random();
        int targetNum = r.nextInt(1, 101);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Игра началась!");
        while (true) {
            System.out.println("Вводит " + player1.getName() + " (игрок1): ");
            player1.setNum(scanner.nextInt());
            String str1 = "";
            if (player1.getNum() == targetNum) {
                System.out.println(player1.getName() + " (игрок1) выиграл!");
                break;
            }

            if (player1.getNum() > targetNum) {
                str1 = "больше";
            } else if (player1.getNum() < targetNum) {
                str1 = "меньше";
            }

            if (player1.getNum() != targetNum) {
                System.out.println("Число " + player1.getNum() + 
                        " " + str1 + " того, что загадал компьютер");
            }

            System.out.println("Вводит " + player2.getName() + " (игрок2): ");
            player2.setNum(scanner.nextInt());
            String str2 = "";
            if (player2.getNum() == targetNum) {
                System.out.println(player2.getName() + " (игрок2) выиграл!");
                break;
            }

            if (player2.getNum() > targetNum) {
                str2 = "больше";
            } else if (player2.getNum() < targetNum) {
                str2 = "меньше";
            }

            if (player2.getNum() != targetNum) {
                System.out.println("Число " + player2.getNum() + 
                        " " + str1 + " того, что загадал компьютер");
            }
        }
    }
}