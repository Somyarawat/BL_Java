import java.util.*;
class BuySellStock2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of days: ");
        int n = sc.nextInt();

        int[] prices = new int[n];
        System.out.println("Enter stock prices: ");
        for(int i = 0; i < n; i++){
            prices[i] = sc.nextInt();
        }
        int totalProfit = 0;
        for(int i = 0; i < n-1; i++){
            if(prices[i + 1] > prices[i]){
                totalProfit = totalProfit + (prices[i+1] - prices[i]);
            }
        }
        System.out.println("Maximum Profit: " + totalProfit);
    }
}