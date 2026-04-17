import java.util.Scanner;

class TicTacToe {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };

        char currentPlayer = 'X';
        boolean gameOver = false;

        System.out.println("🎮 Tic Tac Toe Game");

        while (!gameOver) {

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(board[i][j]);
                    if (j < 2) System.out.print(" | ");
                }
                System.out.println();
                if (i < 2) System.out.println("--+---+--");
            }

            System.out.print("Player " + currentPlayer + " enter row (0-2): ");
            int row = sc.nextInt();

            System.out.print("Player " + currentPlayer + " enter col (0-2): ");
            int col = sc.nextInt();

            if (board[row][col] != ' ') {
                System.out.println("Cell already taken! Try again.");
                continue;
            }

            board[row][col] = currentPlayer;

            if (
                (board[0][0] == currentPlayer && board[0][1] == currentPlayer && board[0][2] == currentPlayer) ||
                (board[1][0] == currentPlayer && board[1][1] == currentPlayer && board[1][2] == currentPlayer) ||
                (board[2][0] == currentPlayer && board[2][1] == currentPlayer && board[2][2] == currentPlayer) ||

                (board[0][0] == currentPlayer && board[1][0] == currentPlayer && board[2][0] == currentPlayer) ||
                (board[0][1] == currentPlayer && board[1][1] == currentPlayer && board[2][1] == currentPlayer) ||
                (board[0][2] == currentPlayer && board[1][2] == currentPlayer && board[2][2] == currentPlayer) ||

                (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) ||
                (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer)
            ) {
                gameOver = true;
                System.out.println("🎉 Player " + currentPlayer + " wins!");
                break;
            }

            // Switch player
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }

    }
}