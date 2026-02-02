import java.util.Scanner;

class Solution{
    public String toLowerCase(String s){
        String a = s.toLowerCase(); 
        return a; 
    }
    public static void main(String[] args) {
        Solution c = new Solution(); 
        Scanner sc = new Scanner(System.in); 
        String s = sc.nextLine();
        System.out.println(c.toLowerCase(s));
        sc.close();
    }
}