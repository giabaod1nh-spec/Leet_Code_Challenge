import java.util.Scanner;

class Test{
    public int getSum(int a , int b){
        a+= b ; 
        return a ; 
    }
    public static void main(String[] args) {
        Test t = new Test(); 
        Scanner sc = new Scanner(System.in); 
        int a = sc.nextInt(); 
        sc.nextLine(); 
        int b = sc.nextInt(); 
        sc.nextLine(); 
        System.out.println(t.getSum(a, b));
        sc.close();
    }
}