import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player1 = new Player(scanner.next());
        Player player2 = new Player(scanner.next());

        GuessNumber game = new GuessNumber(player1, player2);
        // game.start();

        // boolean isRepeat = true;
        // while (isRepeat) {
        //     System.out.println("Хотите продолжить игру? [yes/no]");
        //     String newGame = scanner.next();

        //     if (newGame.equals("yes")) {
        //         guessNumber.startGame();
        //     } else if (newGame.equals("no")) {
        //         isRepeat = false;
        //         break;
        //     }
        // }

        String playerAnswer = "yes";
        while (playerAnswer.equals("yes")) {
            game.start();

            boolean isRepeat = true;
            while (isRepeat) {
                System.out.println("Хотите продолжить игру? [yes/no]");
                playerAnswer = scanner.next();

                if (playerAnswer.equals("no")) {
                    isRepeat = false;
                    break;
                } else if (playerAnswer.equals("yes")) {
                    break;
                }
            }

            if (!isRepeat) {
                break;
            }
        }
    }
}