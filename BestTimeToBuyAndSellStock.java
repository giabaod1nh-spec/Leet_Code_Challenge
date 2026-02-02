import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices){
        int minTemp = prices[0] ;
        int currentProfit , maxProfit= 0 ;
        for(int i = 0 ; i < prices.length ; i ++){
            currentProfit = prices[i] - minTemp;
            if(currentProfit > maxProfit){
                maxProfit = currentProfit;
            }
            if(minTemp > prices[i]){
                minTemp = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("So phan tu cua chuoi la:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Nhap cac gia tri trong chuoi:");
        for(int i = 0 ; i < n ; i ++){
            arr[i] = sc.nextInt();
        }
        BestTimeToBuyAndSellStock obj = new BestTimeToBuyAndSellStock();
        System.out.println(obj.maxProfit(arr));
        sc.close();
    }
}
