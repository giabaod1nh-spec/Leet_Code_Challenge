import java.util.Scanner;

class Luck{
    public int differenceOfSum(int n , int m){
        int sumDiv = 0 ; 
        int sumNotDiv = 0 ; 
        for(int i = 1 ; i <= n ; i ++){
            if(i % m == 0 ){
                sumDiv += i ; 
            }
            if(i %  m != 0 ){
                sumNotDiv += i ; 
            }
        }
        return sumNotDiv - sumDiv; 
    }
    public static void main(String[] args) {
        Luck l = new Luck(); 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int m = sc.nextInt(); 
        System.out.println(l.differenceOfSum(n, m));
        sc.close();
    }
}