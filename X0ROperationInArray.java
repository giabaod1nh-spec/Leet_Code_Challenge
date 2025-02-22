import java.util.Scanner;

class TryHard{
    public int xorOperation(int n , int start){
        int nums = 0 ; 
        int temp = 0 ; 
        for(int i = 0 ; i < n ; i ++){
            temp = start + 2 * i ; 
            nums = nums ^ temp;  
        }
        return nums; 
    }
    public static void main(String[] args) {
        TryHard t = new TryHard(); 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int start = sc.nextInt(); 
        System.out.println(t.xorOperation(n, start));
        sc.close();
    }
}