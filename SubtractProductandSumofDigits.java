import java.util.Scanner;

class solutionsss{
    public int subtractProductandSum(int n ){
        int digits = 0 ; 
        int sum = 0 ; 
        int multi = 1 ; 
        while (n > 0) {
            digits = n % 10 ; 
            sum = sum + digits; 
            multi = multi * digits; 
            n = n /10 ; 
        }
        return multi - sum ; 
    }
    public static void main(String[] args) {
        solutionsss s = new solutionsss(); 
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 
        System.out.println(s.subtractProductandSum(n));
        sc.close();
    }
}