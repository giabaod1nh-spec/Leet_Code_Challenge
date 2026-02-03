package JavaNotion.LeetCode.PrefixSum;

import java.util.HashMap;
import java.util.Scanner;

class Solutionz{
    public boolean checkSubarraySum(int[] nums , int k){
         int currentSum = 0 ;
         boolean checked = false;
        HashMap<Integer , Integer> map = new HashMap<>();
        //Key la currentSum , value la so lan xuat hien cua currentSum
        map.put(0 , 1);
        for(int i = 0 ; i < nums.length ; i++){
            currentSum += nums[i];

            if(map.containsKey(currentSum - k) || currentSum % k == 0){
                checked = true ;
            }else{
                map.put(currentSum , map.getOrDefault(currentSum , 0));
            }
        }
        return checked;
    }
}


public class ContinuousSubArraySum_523 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so k: ");
        int k = sc.nextInt();
        System.out.println("Nhap so phan tu trong nums[]: ");
        int n = sc.nextInt();
        //Tao nums[]
        int[] nums = new int[n];
        System.out.println("Nhap cac phan tu cua nums[]: ");
        for(int i = 0 ; i < n ; i ++){
            nums[i] = sc.nextInt();
        }

        Solutionz solutionz = new Solutionz();
        System.out.println(solutionz.checkSubarraySum(nums , k ));
    }
}
