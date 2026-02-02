import java.util.Arrays;
import java.util.Scanner;

public class RotateArray_189 {
    public void rotate(int[] nums , int k){
        int newArr[] = new int[nums.length];

        for(int i = 0 ; i < nums.length ; i++){
            int newIndex = (i + k) % nums.length;
            newArr[newIndex] = nums[i];
        }
        System.arraycopy(newArr , 0 , nums , 0 , nums.length);

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap do dai cua chuoi:");
        int n = sc.nextInt();
        System.out.println("Nhap do dai k can dao lon:");
        int k = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Nhap phan tu cua chuoi:");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        RotateArray_189 obj  = new RotateArray_189();
        obj.rotate(arr , k );
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
