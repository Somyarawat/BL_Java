import java.util.*;
class BuySellStock{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of days: ");
        int n = sc.nextInt();

        int[] prices = new int[n];
        System.out.println("Enter prizes: ");

        for(int i = 0; i < n; i++){
            prices[i] = sc.nextInt();
        }

        int maxProfit = 0;

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                int profit = prices[j] - prices[i];

                if(profit > maxProfit){
                    maxProfit = profit;
                }
            }
        }
        System.out.println("Maximum Profit: " + maxProfit);
    }
}