import java.util.Scanner;

public class BestTimeToBuyAndSellStockII {
    public int maxProfit(int [] prices){
        int maxProfit = 0 ;
        for(int i = 1 ; i < prices.length ; i ++){
            if(prices[i -1] < prices[i]){
                maxProfit += prices[i] - prices[i-1];
            }
        }
        return maxProfit;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap do dai cua chuoi");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = sc.nextInt();
        }
        BestTimeToBuyAndSellStock object = new BestTimeToBuyAndSellStock();
        System.out.println(object.maxProfit(arr));
        sc.close();
    }
}
