package JavaNotion.LeetCode.TwoPointer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

class Moan {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        //Save currentSum intialize va bat dau index tu -1
        map.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            //Lay target vi target luon > nums[i]
            if (map.containsKey(target -nums[i])  && (map.get(target - nums[i]) >= 0)) {
                return new int[]{Math.min(i, map.get(target -nums[i]) ) ,Math.max(i, map.get(target -nums[i])) };
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
public class TwoSum_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Gia tri cua target: ");
        int target = sc.nextInt();

        System.out.println("So phan tu cua nums[]: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0 ; i < nums.length ; i++){
            nums[i] = sc.nextInt();
        }

        Moan moan = new Moan();
        System.out.println(Arrays.toString(moan.twoSum(nums, target)));
    }
}
