import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement_27 {
    public int removeElement(int[] nums , int val){
          int index = 0 ;
          for(int i = 0 ; i < nums.length ; i ++){
              if(nums[i] != val){
                  nums[index] = nums[i];
                  index++ ;
              }
          }
          return  index;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap do dai cua array:");
        int n = sc.nextInt();;

        int[] arr = new int[n];
        System.out.println("Nhap gia tri cac phan tu:");
        for(int i = 0 ; i < n ; i ++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Nhap gia tri muon remove:");
        int val = sc.nextInt();
        RemoveElement_27 obj = new RemoveElement_27();
        obj.removeElement(arr ,val );
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
