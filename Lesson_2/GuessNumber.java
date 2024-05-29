import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    void startGame() {
        Random r = new Random();
        int computerNum = r.nextInt(1, 101);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            player1.setNumber(scanner.nextInt());
            String result1 = "";
            if (player1.getNumber() != computerNum) {
                if (player1.getNumber() > computerNum) {
                    result1 = "больше";
                } else if (player1.getNumber() < computerNum) {
                    result1 = "меньше";
                }
                System.out.println("Число " + player1.getNumber() + 
                        " " + result1 + " того, что загадал компьютер");
            } else {
                System.out.println("Игрок 1 выйграл!");
                break;
            }

            player2.setNumber(scanner.nextInt());
            String result2 = "";
            if (player2.getNumber() != computerNum) {
                if (player2.getNumber() > computerNum) {
                    result2 = "больше";
                } else if (player2.getNumber() < computerNum) {
                    result2 = "меньше";
                }
                System.out.println("Число " + player2.getNumber() + 
                        " " + result2 + " того, что загадал компьютер");
            } else {
                System.out.println("Игрок 2 выйграл!");
                break;
            }
        }
    }
}