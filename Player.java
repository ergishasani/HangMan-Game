import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name; // Player's name
    private int score; // Player's score (if applicable)
    private List<Character> guessedLetters; // List of letters the player has guessed

    // Constructor to initialize a player with a given name
    public Player(String name) {
        this.name = name;
        this.score = 0;
        this.guessedLetters = new ArrayList<>();
    }

    // Getter method to retrieve the player's name
    public String getName() {
        return name;
    }

    // Getter method to retrieve the player's score
    public int getScore() {
        return score;
    }

    // Getter method to retrieve the list of guessed letters
    public List<Character> getGuessedLetters() {
        return guessedLetters;
    }

    // Method to increase the player's score
    public void increaseScore() {
        score++;
    }

    // Method for the player to guess a letter
    public void guessLetter(char letter) {
        guessedLetters.add(letter);
    }

    // Add other methods or attributes as needed

    // Example method: Display player information
    public void displayPlayerInfo() {
        System.out.println("Player: " + name);
        System.out.println("Score: " + score);
        System.out.print("Guessed Letters: ");
        System.out.println(guessedLetters);
    }
}