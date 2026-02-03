package JavaNotion.LeetCode.TwoPointer;

import java.util.*;

class Magie{
    public List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int tempSum = 0 ;
        //Sau khi sort , cac phan tu trung nhau nam canh nhau
       for(int i = 0 ; i < nums.length -2 ; i ++){
       //Bo qua cac phan tu trung nhau
             if(i >  0  && nums[i] == nums[i - 1]){
                 continue;
             }
             int left = i + 1 ;
             int right = nums.length -1 ;
             while(left < right) {
                 tempSum = nums[left] + nums[right];
                 if (tempSum + nums[i] == 0) {
                     //Add array chua 3 phan tu co sum = 0 vao
                     res.add(Arrays.asList(nums[left], nums[i], nums[right]));

                     //Bo qua cac phan tu trung lap cho left va right
                     while(left < right && nums[left] == nums[left +1]){
                         left++;
                     }
                     while ((left < right && nums[right] == nums[right -1])){
                         right--;
                     }
                     left++;
                     right--;
                 }else if(tempSum < -nums[i]){
                     left++;
                 }else{
                     right--;
                 }
             }
       }
       return res;
    }
}


public class TreeSum_15 {
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Nhap so phan tu trong nums[]: ");
         int n = sc.nextInt();
         //Khoi tao nums[]
         int[] nums = new int[n];
         for(int i = 0 ; i < n ; i ++){
             nums[i] = sc.nextInt();
         }
         Magie magie = new Magie();
         System.out.println(magie.threeSum(nums));
     }
}
