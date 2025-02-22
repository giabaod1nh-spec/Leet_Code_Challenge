import java.util.Scanner;

class Lang{
    public int maxProfit(int[] prices){
       int buyPrice = prices[0]; 
       int profit = 0 ; 
       for(int i = 1 ; i < prices.length ; i ++){
                if (buyPrice > prices[i]) {
                    buyPrice = prices[i] ; 
                }
                profit = Math.max(profit, prices[i] - buyPrice); 
       } 
       return profit; 
    }
    public static void main(String[] args) {
        Lang l = new Lang(); 
        Scanner sc = new Scanner(System.in); 
        int size = sc.nextInt(); 
        sc.nextLine(); 
        int[] prices = new int[size]; 
        for(int j = 0 ; j < size ; j ++){
            prices[j] = sc.nextInt();
        }
        System.out.println(l.maxProfit(prices));
        sc.close();
    }
}