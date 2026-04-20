import java.util.*;

class DeckOfCards {

    // Initialize deck
    public static String[] createDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10",
                          "Jack","Queen","King","Ace"};

        String[] deck = new String[suits.length * ranks.length];

        int index = 0;

        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }

        return deck;
    }

    // Shuffle deck
    public static void shuffle(String[] deck) {
        int n = deck.length;

        for (int i = 0; i < n; i++) {
            int rand = i + (int)(Math.random() * (n - i));

            // swap
            String temp = deck[i];
            deck[i] = deck[rand];
            deck[rand] = temp;
        }
    }

    // Distribute cards
    public static String[][] distribute(String[] deck, int players, int cards) {
        if (players * cards > deck.length) {
            System.out.println("Not enough cards!");
            return null;
        }

        String[][] result = new String[players][cards];

        int index = 0;

        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cards; j++) {
                result[i][j] = deck[index++];
            }
        }

        return result;
    }

    // Display cards
    public static void display(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("\nPlayer " + (i+1) + ":");

            for (String player : players[i]) {
                System.out.println(player);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int players = sc.nextInt();
        int cards = sc.nextInt();

        String[] deck = createDeck();

        shuffle(deck);

        String[][] result = distribute(deck, players, cards);

        if (result != null) {
            display(result);
        }
    }
}