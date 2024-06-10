import java.util.Random;

public class MyFirstGame {
    public static void main(String[] args) throws InterruptedException {
        int computerNum = 12;
        int playerNum = 0;

        Random r = new Random();
        while (playerNum != computerNum) {
            playerNum = r.nextInt(1, 101);

            System.out.println(playerNum);
            Thread.sleep(1000);

            if (playerNum > computerNum) {
                System.out.println("Число " + playerNum + " больше того, что загадал компьютер");
            } else if (playerNum < computerNum) {
                System.out.println("Число " + playerNum + " меньше того, что загадал компьютер");
            }
        }

        System.out.println("Вы победили!");
    }
}