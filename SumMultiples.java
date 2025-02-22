import java.util.Scanner;

class Solution{
    public int sumOfMultiples (int n){
        int sum = 0 ; 
        for(int i = 1 ; i <= n ; i ++ ){
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                sum = sum + i ; 
            }
        }
            return sum ; 
    } 
    public static void main(String[] args) {
        Solution s = new Solution(); 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        System.out.println(s.sumOfMultiples(n)); 
        sc.close();
    }
}