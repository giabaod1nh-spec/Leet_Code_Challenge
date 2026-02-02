import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArray_88 {
    public void merge(int[] nums1 , int m , int[] nums2 , int n ){
               for(int j = 0 ,  i = m ; j < n ; j++){
                        nums1[i] = nums2[j] ;
                        i++ ;
               }
        Arrays.sort(nums1);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int [] arr1 = new int[n1] ;
        int [] arr2 = new int[n2];
        System.out.println("Nhap gia tri tung phan tu trong mang1:");
        for(int i = 0 ; i < n1 ; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("Nhap gia tri tung phan tu trong mang2:");
        for(int j = 0 ; j < n2 ; j++){
            arr2[j] = sc.nextInt();
        }

        MergeSortedArray_88 obj = new MergeSortedArray_88();
        obj.merge(arr1 , 3,  arr2 , 3);
        System.out.println(Arrays.toString(arr1));
        sc.close();
    }
}
