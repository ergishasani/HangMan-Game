import java.util.Scanner;

public class HangmanMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Hangman!");
        System.out.print("Enter the number of players: ");
        int numPlayers = scanner.nextInt();

        // Initialize players
        String[] playerNames = new String[numPlayers];
        for (int i = 0; i < numPlayers; i++) {
            System.out.print("Enter the name for Player " + (i + 1) + ": ");
            playerNames[i] = scanner.next();
        }

        // Start the Hangman game
        HangmanGame hangmanGame = new HangmanGame(playerNames);
        hangmanGame.startGame();
        
        scanner.close();
    }
}
