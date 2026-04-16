import java.util.*;
class SnakeLadder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int player1 = 0;
        int player2 = 0;

        boolean player1Turn = true;

        System.out.println("Snake And Ladder Game");

        while(player1 < 100 && player2 < 100){
            if (player1Turn) {
                System.out.print("Player 1 - Enter Dice: ");
                int dice = sc.nextInt();

                if(dice < 1 || dice > 6) {
                    System.out.println("Invalid Input");
                    continue;
                }

                if (player1 + dice <= 100){
                    player1 += dice;
                }
                else {
                    System.out.println("Move Skipped, need exact number");
                }


                if (player1 == 2){
                    player1 = 23;
                }
                else if (player1 == 7){
                    player1 = 29;
                }
                else if(player1 == 54){
                    player1 = 69;
                }
                else if(player1 == 70){
                    player1 = 90;
                }
                else if(player1 == 80){
                    player1 = 83;
                }
                else if (player1 ==87){
                    player1 = 93;
                }

                else if(player1 == 27){
                    player1 = 7;
                }
                else if(player1 == 35){
                    player1 = 5;
                }
                else if(player1 == 50){
                    player1 = 34;
                }
                else if(player1 == 66){
                    player1 = 24;
                }
                else if(player1 == 73){
                    player1 = 12;
                }
                else if(player1 == 82){
                    player1 = 26;
                }
                System.out.println("Player 1 position: " + player1);
            }

            else {
                System.out.print("Player 2 - Enter Dice: ");
                int dice = sc.nextInt();

                if(dice < 1 || dice > 6) {
                    System.out.println("Invalid Input");
                    continue;
                }

                if (player2 + dice <= 100){
                    player2 += dice;
                }
                else {
                    System.out.println("Move Skipped, need exact number");
                }
                
                if (player2 == 2){
                    player2 = 23;
                }    
                else if (player2 == 7){
                    player2 = 29;
                }
                else if(player2 == 54){
                    player2 = 69;
                }
                else if(player2 == 70){
                    player2 = 90;
                }
                else if(player2 == 80){
                    player2 = 83;
                }
                else if (player2 ==87){
                    player2 = 93;
                }

                else if(player2 == 27){
                    player2 = 7;
                }
                else if(player2 == 35){
                    player2 = 5;
                }
                else if(player2 == 50){
                    player2 = 34;
                }
                else if(player2 == 66){
                    player2 = 24;
                }
                else if(player2 == 73){
                    player2 = 12;
                }
                else if(player2 == 82){
                    player2 = 26;
                }
                System.out.println("Player 2 position: " + player2);
            }
            player1Turn = !player1Turn;
        }
        if(player1 == 100){
            System.out.println("Player 1 wins");
        }
        else {
            System.out.println("Player 2 wins");
        }
    }
}