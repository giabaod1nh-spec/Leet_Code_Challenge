import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Dirak{
    public List<Integer> addtoArrayForm(int[] num , int k){ 
        List<Integer> list = new ArrayList<Integer>(); 
         for(int i = num.length -1; i >= 0 ; i--){
            list.add(0 , (num[i] + k) % 10 );
            k = (num[i] + k) / 10 ; 
         }
         while (k > 0 ) {
            list.add(0, k % 10 );
            k /= 10 ; 
         }
         return list; 
    }
    public static void main(String[] args) {
        Dirak d = new Dirak(); 
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(); 
        int size = sc.nextInt();
        int[] num = new int[size]; 
        for(int h = 0 ; h < size ; h ++){
            num[h] = sc.nextInt(); 
        }
        System.out.println(Arrays.toString((d.addtoArrayForm(num, k)).toArray()));
        sc.close();
    }
}