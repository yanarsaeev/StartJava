import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player1 = new Player("Isa");
        Player player2 = new Player("Ali");

        GuessNumber guessNumber = new GuessNumber(player1, player2);
        guessNumber.startGame();

        boolean isRepeat = true;
        while (isRepeat) {
            System.out.println("Хотите продолжить игру? [yes/no]");
            String newGame = scanner.nextLine();

            if (newGame.equals("yes")) {
                guessNumber.startGame();
            } else if (newGame.equals("no")) {
                isRepeat = false;
                break;
            }
        }
    }
}