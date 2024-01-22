public class CircularLinkedList {
    private Node current; // The current node in the circular linked list

    // Constructor to initialize the circular linked list with player names
    public CircularLinkedList(String[] playerNames) {
        validatePlayerNames(playerNames);

        // Create the head (first node) of the circular linked list
        Node head = new Node(playerNames[0]);
        Node tail = head;

        // Create the rest of the circular linked list
        for (int i = 1; i < playerNames.length; i++) {
            Node newNode = new Node(playerNames[i]);
            tail.next = newNode;
            tail = newNode;
        }

        tail.next = head; // Make it circular
        current = head; // Set the current node to the head
    }

    // Method to get the current player associated with the current node
    public Player getCurrentPlayer() {
        return current.player;
    }

    // Method to move to the next player in the circular linked list
    public void moveToNextPlayer() {
        current = current.next;
    }

    // Method to validate player names array
    private void validatePlayerNames(String[] playerNames) {
        if (playerNames == null || playerNames.length == 0) {
            throw new IllegalArgumentException("Player names cannot be null or empty.");
        }
    }

    // Internal Node class representing each node in the circular linked list
    private static class Node {
        private Player player; // The player associated with the node
        private Node next; // Reference to the next node in the list

        // Constructor to create a new node with the given player name
        public Node(String playerName) {
            this.player = new Player(playerName);
            this.next = null;
        }
    }
}
