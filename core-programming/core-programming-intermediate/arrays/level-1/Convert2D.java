import java.util.*;
class Convert2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row: ");
        int r = sc.nextInt();
        System.out.print("Enter column: ");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];
        System.out.println("Enter elements of Array: ");

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int[] oneD = new int[r * c];
        int index = 0;

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                oneD[index++] = arr[i][j];
            }
        }
        for (int x : oneD){
            System.out.print(x + " ");
        }
    }
}