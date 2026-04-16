import java.util.*;
class FizzBuzzArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        if(num <=0) {
            System.out.println("Invalid Number");
        }

        String[] arr = new String[num + 1];

        for (int i = 1; i <= num; i++){
            if(i % 3 == 0 && i % 5 == 0) {
                arr[i] = "FizzBuzz";
            }
            else if(i % 3 == 0){
                arr[i] = "Fizz";
            }
            else if(i % 5 == 0){
                arr[i] = "Buzz";
            }
            else {
                arr[i] = String.valueOf(i);
            }
        }
        for(int i = 1; i <= num; i++){
            System.out.println("Position " + i + " = " + arr[i]);
        }
    }
}