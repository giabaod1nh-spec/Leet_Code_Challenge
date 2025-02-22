import java.util.Scanner;

class HardCore{
    public int theMaximumAchievableX(int num , int t){
        int x = 0 ; 
        x = num + t* 2 ;  
        return x ; 
    }
    public static void main(String[] args) {
        HardCore h = new HardCore(); 
        Scanner sc = new Scanner(System.in); 
        int num = sc.nextInt(); 
        int t = sc.nextInt(); 
        System.out.println(h.theMaximumAchievableX(num, t));
        sc.close();
    }
}