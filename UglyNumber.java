import java.util.Scanner;

class Olm{
    public boolean isUgly(int n){
       boolean result = false;
       int[] prime = {2 , 3 , 5};  
       if (n < 1) {
        result = false; 
        }
       for(int i : prime){
        while (n % i == 0 ) {
            n /= i ; 
        }
    }
        if (n == 1) {
            result = true; 
        }
        return result; 
    }
    public static void main(String[] args) {
        Olm o = new Olm(); 
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 
        System.out.println(o.isUgly(n));
        sc.close();
    }
}

