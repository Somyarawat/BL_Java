import java.util.*;

class SnakeAndLadder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Snake And Ladder Game!");
        int player1 = 0;
        int player2 = 0;

        boolean player1Turn = true;

        while(player1 < 100 && player2 < 100){
            System.out.print("Enter dice: ");
            int dice = sc.nextInt();

            if(dice < 1 || dice > 6){
                System.out.println("Invalid Move");
            }
            if (player1Turn){
                

            

            if(player1 + dice > 100) {
                System.out.println("Move Skipped");
            }
            else {
                player1 += dice;
                System.out.println("Position of Player 1: " + player1);
            }

            if(player1 == 7) player1 = 23;
            else if(player1 == 30) player1 = 50;
            else if(player1 == 62) player1 = 85;

            else if(player1 == 48) player1 = 27;
            else if(player1 == 63) player1 = 52;
            else if(player1 == 98) player1 = 15;
            }

            

            else{

            if(player2 + dice > 100) {
                System.out.println("Move Skipped");
            }
            else {
                player2 += dice;
                System.out.println("Position of Player 2: " + player2);
            }

            if(player2 == 7) player2 = 23;
            else if(player2 == 30) player2 = 50;
            else if(player2 == 62) player2 = 85;

            else if(player2 == 48) player2 = 27;
            else if(player2 == 63) player2 = 52;
            else if(player2 == 98) player2 = 15;
        }

        player1Turn = !player1Turn;

        }

        

        
        if(player1 == 100) {
            System.out.println("Congratulations! Player1 Wins");
        }
        else{
            System.out.println("Congratulations! Player2 Wins");
        }
    }
}