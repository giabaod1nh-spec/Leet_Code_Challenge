
import java.util.Scanner;

class Solution{
    public int countDigits (int num){
        int count = 0 ; 
        int digit = 0 ; 
        int original = num ; 
        while(num >0){
            digit = num % 10 ; 
            if (original % digit == 0){
                count += 1; 
            }
            num = num / 10 ; 
        }
        return count; 
    }
    public static void main(String[] args){
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in); 
        int num = sc.nextInt();
        System.out.println(s.countDigits(num));
        sc.close();
    }
}