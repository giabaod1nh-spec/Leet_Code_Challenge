import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray_26 {
    public int removeDuplicates(int[] nums) {
        int index = 2 ;
        if(nums.length == 0 ){
            return  0 ;
        }
        for(int i = 2 ; i < nums.length ;  i ++){
             if(nums[i] != nums[index - 2]){
                    nums[index] = nums[i] ;
                    index++;
             }
        }
        return index ; 
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua day:");
        int n = sc.nextInt();
        int[] arr = new int[n] ;
        System.out.println("Nhap phan tu trong day:");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        RemoveDuplicatesFromSortedArray_26 obj = new RemoveDuplicatesFromSortedArray_26();
        obj.removeDuplicates(arr) ;
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
