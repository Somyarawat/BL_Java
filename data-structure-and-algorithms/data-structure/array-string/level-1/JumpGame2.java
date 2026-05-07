import java.util.*;
class JumpGame2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter elements: ");

        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        int jump = 0;
        int i = 0;

        while(i < n - 1){
            i = i + nums[i];
            jump++;
        }

        System.out.println("Minimum jumps: " + jump);
    }
}