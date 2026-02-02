import java.util.Arrays;
import java.util.Scanner;

public class MajorityElement_169 {
    public int majorityElement(int [] nums){
        int candinate = 0 ;
        int count = 0 ;
        for(int num : nums){
           if(count == 0 ){
               candinate = num;
               count = 1 ;
           } else if (num == candinate) {
               count++;
           }
           else {
               count--;
           }
        }
        return candinate;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("So phan tu cua chuoi la:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Nhap cac gia tri trong chuoi:");
        for(int i = 0 ; i < n ; i ++){
            arr[i] = sc.nextInt();
        }
        MajorityElement_169 obj = new MajorityElement_169();
        obj.majorityElement(arr);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
