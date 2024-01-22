# HangMan-Game
This repository contains a simple implementation of the Hangman game in Java. The game consists of three main classes: CircularLinkedList, HangmanGame, and Player. The game is played in the console, allowing multiple players to take turns guessing letters and attempting to reveal the hidden word.
Files in the Repository
CircularLinkedList.java

Manages a circular linked list of players, ensuring each player takes turns in the game.
HangmanGame.java

Implements the main logic of the Hangman game, including word selection, player turns, and game state tracking.
Player.java

Represents individual players, storing their names, scores, and the letters they have guessed.
HangmanMain.java

Contains the main method to initiate the Hangman game, allowing players to enter their names and start playing.
How to Play
Run HangmanMain.java to start the game.
Enter the number of players and provide their names.
Players take turns guessing letters to reveal the hidden word.
The game displays the current word, the hangman figure, and the remaining incorrect guesses.
The game continues until the word is guessed or the maximum incorrect guesses are reached.
Additional Notes
The Hangman game displays a simple ASCII art hangman figure based on the number of incorrect guesses.
Players can continue playing rounds with different words.
Feel free to explore and modify the code to enhance the game or integrate additional features. Enjoy playing Hangman!
