import java.util.Random;

public class MyFirstGame {
    public static void main(String[] args) throws InterruptedException {
        int computerNum = 12;
        int playerNum = 0;
        while (playerNum != computerNum) {
            Random r = new Random();
            playerNum = r.nextInt(1, 100);

            System.out.println(playerNum + "\r");
            Thread.sleep(1000);

            if (playerNum > computerNum) {
                System.out.println("Число " + playerNum + " больше того, что загадал компьютер");
            } else if (playerNum < computerNum) {
                System.out.println("Число " + playerNum + " меньше того, что загадал компьютер");
            } else {
                System.out.println("Вы победили!");
            }
        }
    }
}