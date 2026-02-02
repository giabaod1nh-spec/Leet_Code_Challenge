package JavaNotion.LeetCode.PrefixSum;

import java.util.HashMap;
import java.util.Scanner;

class Solution{
    public int subarraySum(int[] nums , int k){
        int currentSum = 0 ;
        int count = 0 ;
        HashMap<Integer , Integer> map = new HashMap<>();

        //TH dac biet: PrefixSum = 0 xuat hien 1 lan (de tinh mang con tu dau)
        //De vi du co doan [0 , 3] con biet bat dau tu 0 la phan tu dau tien
        map.put(0 , 1);
        for(int i = 0 ; i < nums.length ; i++){
            currentSum += nums[i];
            if (map.containsKey(currentSum - k)){
                count += map.get(currentSum -k);
            }
            //Neu gia tri nay chua xuat hien thi cap nhat vao map
            //map.getOrDefault(currentSum ,0) + 1) ;
            //Kiem tra xem currentSum da xuat hien trong map chua
            //Neu co lay so lan xuat hien cu ra roi + 1  <currentSum , n + 1>
            //Neu chua co thi tra ve so 0 , xong duoc put vao <currentSum , 0>
            map.put(currentSum , map.getOrDefault(currentSum , 0) + 1);
        }
        return count;
    }
}


public class Subarray_Sum_Equals_K_560 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap gia tri k: ");
        int k = sc.nextInt();

        System.out.println("Nhap so phan tu cua array");
        int n = sc.nextInt();

        //Khoi tao array va nhap gia tri
        int arr[] = new int[n];
        System.out.println("Nhap phan tu cho array: ");
        for(int i = 0 ; i < n ; i ++){
            arr[i] = sc.nextInt();
        }

        Solution solution = new Solution();
        System.out.println(solution.subarraySum(arr , k));
    }
}
