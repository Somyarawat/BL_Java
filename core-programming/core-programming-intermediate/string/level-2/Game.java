import java.util.*;

class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int games = sc.nextInt();

        int userWin = 0, compWin = 0;

        for (int i = 0; i < games; i++) {
            int user = sc.nextInt(); // 0 rock,1 paper,2 scissors
            int comp = (int)(Math.random() * 3);

            if (user == comp) continue;

            if ((user == 0 && comp == 2) ||
                (user == 1 && comp == 0) ||
                (user == 2 && comp == 1))
                userWin++;
            else
                compWin++;
        }

        System.out.println("User Wins: " + userWin);
        System.out.println("Computer Wins: " + compWin);
    }
}