import java.util.Scanner;

class Love{
    public int countEven(int num){
        int count = 0 ; 
        int sum = 0 ;
       for(int i = 2 ; i < num + 1 ; i ++){
            while (i != 0) { 
                sum+= i % 10;
                i/= 10 ; 
            }
            if (sum % 2 == 0 ) {
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        Love l = new Love(); 
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(l.countEven(num));
        sc.close();
    }
}