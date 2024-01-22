import java.util.Scanner;

public class HangmanGame {
    private CircularLinkedList playerList;
    private String wordToGuess;
    private StringBuilder guessedWord;
    private int incorrectGuessesAllowed;
    private int incorrectGuesses;

    public HangmanGame(String[] players) {
        playerList = new CircularLinkedList(players);
        incorrectGuessesAllowed = 6;
    }

    public void startGame() {
        chooseWordToGuess();
        initializeGuessedWord();

        while (!gameOver()) {
            Player currentPlayer = playerList.getCurrentPlayer();
            displayGameState();
            makeGuess(currentPlayer);
            playerList.moveToNextPlayer();
        }

        displayResult();
    }

    private void chooseWordToGuess() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the word to be guessed: ");
        wordToGuess = scanner.nextLine().toUpperCase();
    }

    private void initializeGuessedWord() {
        guessedWord = new StringBuilder(wordToGuess.length());
        for (int i = 0; i < wordToGuess.length(); i++) {
            if (Character.isLetter(wordToGuess.charAt(i))) {
                guessedWord.append('_');
            } else {
                guessedWord.append(wordToGuess.charAt(i));
            }
        }
    }

    private void displayGameState() {
        System.out.println("Word: " + guessedWord);
        System.out.println("Incorrect Guesses Remaining: " + (incorrectGuessesAllowed - incorrectGuesses));
        displayHangman();
    }

    private void displayHangman() {
        int maxIncorrectGuesses = 6;

        switch (incorrectGuesses) {
            case 1:
                System.out.println("   _______");
                System.out.println("   |     |");
                System.out.println("   |     O");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |_________");
                break;
            case 2:
                System.out.println("   _______");
                System.out.println("   |     |");
                System.out.println("   |     O");
                System.out.println("   |     |");
                System.out.println("   |");
                System.out.println("   |_________");
                break;
            case 3:
                System.out.println("   _______");
                System.out.println("   |     |");
                System.out.println("   |     O");
                System.out.println("   |    /|");
                System.out.println("   |");
                System.out.println("   |_________");
                break;
            case 4:
                System.out.println("   _______");
                System.out.println("   |     |");
                System.out.println("   |     O");
                System.out.println("   |    /|\\");
                System.out.println("   |");
                System.out.println("   |_________");
                break;
            case 5:
                System.out.println("   _______");
                System.out.println("   |     |");
                System.out.println("   |     O");
                System.out.println("   |    /|\\");
                System.out.println("   |    /");
                System.out.println("   |_________");
                break;
            case 6:
                System.out.println("   _______");
                System.out.println("   |     |");
                System.out.println("   |     O");
                System.out.println("   |    /|\\");
                System.out.println("   |    / \\");
                System.out.println("   |_________");
                break;
            default:
                // Display an empty hangman figure
                System.out.println("   _______");
                System.out.println("   |     |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |_________");
                break;
        }
    }

    private void makeGuess(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(player.getName() + ", enter your guess: ");
        char guess = scanner.next().toUpperCase().charAt(0);

        if (wordToGuess.indexOf(guess) == -1) {
            incorrectGuesses++;
        }

        for (int i = 0; i < wordToGuess.length(); i++) {
            if (wordToGuess.charAt(i) == guess) {
                guessedWord.setCharAt(i, guess);
            }
        }
    }

    private boolean gameOver() {
        return guessedWord.toString().equals(wordToGuess) || incorrectGuesses >= incorrectGuessesAllowed;
    }

    private void displayResult() {
        if (guessedWord.toString().equals(wordToGuess)) {
            System.out.println("Congratulations! You guessed the word: " + wordToGuess);
        } else {
            System.out.println("Sorry, you couldn't guess the word. The correct word was: " + wordToGuess);
        }
    }
}
