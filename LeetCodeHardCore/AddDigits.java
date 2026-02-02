package LeetCodeHardCore;

import java.util.Scanner;

class Solution{
    public int addDigits (int num){
        int digit = 0 ; 
        int newNum = 0 ; 
        while(num >0){
            digit = num % 10 ; 
            newNum = newNum + digit; 
            num = num /10 ; 
        }
        if(newNum > 9 ){
            return addDigits(newNum); 
        }
        else{
            return newNum; 
        }
}
    public static void main(String[] args) {
        Solution s = new Solution(); 
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); 
        System.out.println(s.addDigits(num));
        sc.close();
    }
}
