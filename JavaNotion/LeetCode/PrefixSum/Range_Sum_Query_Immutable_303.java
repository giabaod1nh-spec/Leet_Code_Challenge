package JavaNotion.LeetCode.PrefixSum;

import java.util.Scanner;

class NumArray{
    private final int nums[];
    public NumArray(int[] nums){
        this.nums = nums;
    }

    public int sumRange(int left , int right){
        int prefix[] = new int[nums.length + 1];
        prefix[0] = 0 ;
        for(int i = 0 ; i < nums.length ; i ++){
            prefix[i + 1] = prefix[i] + nums[i];
        }

        return prefix[right + 1] - prefix[left];
    }
}

//Best practice with 0(1)
//class NumArray {
    //int[] preSum;
    //public NumArray(int[] nums) {
        //preSum = nums; // pass by pointer!
        //for (int i = 1; i < preSum.length; ++i)
            //preSum[i] += preSum[i-1];
    //}

    //public int sumRange(int left, int right) {
        //if (left == 0) return preSum[right];
        //return preSum[right] - preSum[left-1];
    //}
//}


public class Range_Sum_Query_Immutable_303{
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Nhap so phan tu cua nums[]: ");
         int n = sc.nextInt();

         int[] nums = new int[n];
         System.out.println("Nhap cac phan tu trong nums[]: ");
         for(int i = 0 ; i < nums.length ; i ++){
             nums[i] = sc.nextInt();
         }
         //Intialize NumArray object with int[] nums
         NumArray numArray = new NumArray(nums);
         System.out.println( numArray.sumRange(0 , 2));
         System.out.println(numArray.sumRange(2 , 5)) ;
         System.out.println(numArray.sumRange(0 , 5));
     }
}
