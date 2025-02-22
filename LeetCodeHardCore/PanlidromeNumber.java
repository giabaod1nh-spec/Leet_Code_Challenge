package LeetCodeHardCore;
import java.util.Scanner;

class Solution{
  public boolean isPalindrome(int x){
   int temp = 0 ; 
   int y = x ; 
   int reverse = 0 ; 
   if (x < 0 ) {
    return false;

   }
   while( x > 0){
    temp = x % 10 ; 
    reverse = reverse * 10 + temp ; 
    x = x / 10 ; 
   }
   return reverse == y ; 
  }
  public static void main(String[] args) {
    Solution s = new Solution() ; 
    Scanner sc = new Scanner(System.in); 
    System.out.println("Input x:");
    int x = sc.nextInt();
    System.out.println(s.isPalindrome(x));
    sc.close();
  }
}