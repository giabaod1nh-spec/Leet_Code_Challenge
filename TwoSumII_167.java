import java.util.Arrays;
import java.util.Scanner;

public class TwoSumII_167 {
    public int[] twoSum(int [] numbers , int target){
        int i = 0 ;
        int j = numbers.length - 1 ;
        while(i != j){
            if(numbers[i] + numbers[j] > target){
                   j--;
            }else if(numbers[i] + numbers[j] < target){
                i++;
            }
            else return new int[]{i+ 1 , j + 1};
        }
        return new int[0];
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int value = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = sc.nextInt();
        }
        TwoSumII_167 obj = new TwoSumII_167();
        System.out.println(Arrays.toString(obj.twoSum(arr , value)));
        sc.close();
    }
}
