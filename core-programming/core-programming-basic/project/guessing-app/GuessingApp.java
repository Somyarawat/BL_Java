import java.util.*;
class GuessingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Player 1: Enter a number (1 - 100): ");
        int targetNumber = sc.nextInt();

        int guess = 0;
        int attempts = 0;

        System.out.println("Player 2: Start The Guessing: ");

        while(guess != targetNumber) {

            System.out.print("Enter Your Guess: ");
            guess = sc.nextInt();
            attempts ++;

            if (guess < targetNumber) {
                System.out.println("Low");
            }
            else if (guess > targetNumber) {
                System.out.println("High");
            }
            else {
                System.out.println("Correct " + attempts + " attempts");
            }
        }
    }
}