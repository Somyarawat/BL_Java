import java.util.*;
class JumpGame{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter elements: ");

        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int maxJump = 0;
        for(int i = 0; i < n; i++){
            if(i > maxJump){
                System.out.println("false");
                return;
            }
            if(i + nums[i] > maxJump){
                maxJump = i + nums[i];
            }
        }
        System.out.println("true");
    }
}