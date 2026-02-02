package JavaNotion.LeetCode.PrefixSum;

import java.util.HashMap;
import java.util.Scanner;

//Giai quyet bai toan la cu tao prefix nhu bth
//Nhung xu li la gap 0 thi -1 , gap 1 thi + 1
//VD:[0 ,1 ,1 , 1 , 1, 1, 0 , 0 , 0] -> -1 , 0 , 1 , 2 , 3 , 4 , 3 , 2 , 1
class Solutions{
    public int findMaxLength(int[] nums){
        int currentSum = 0 ;
        int maxLength = 0 ;
        //Key: currentSum , Value : index noi bat dau tong1 = tong2
        //O A co tong S , A -> B co tong S -> 1 voi 0 deu nhau
        HashMap<Integer , Integer> map = new HashMap<>();
        map.put(0 , -1);
        for(int i = 0 ; i < nums.length ; i++){
            //if nums[i] = 1 then + 1 else nums[i] = 0 then -1
            currentSum += (nums[i] == 1) ? 1 : -1 ;

            //Check xem currentSum da xuat hien truoc do chua
            if(map.containsKey(currentSum)){
                //Tinh length tu lan dau tien thay currentSum nay den hien tai
                //Lay index cua currentSum do
                int prevIndex = map.get(currentSum);
                maxLength = Math.max(maxLength , i - prevIndex);

            }else{
                //Neu chua thi ghi lai vi tri currentSum hien tai
                map.put(currentSum ,i);
            }
        }
    return maxLength;
    }
}
public class ContiguousArray_525 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("So phan tu trong nums[]: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        // Nhap cac phan tu vao trong array
        System.out.println("Nhap cac phan tu vao trong nums[]: ");
        for(int i = 0 ; i < n ; i ++){
            nums[i] = sc.nextInt();
        }

        Solutions solutions = new Solutions();
        System.out.println(solutions.findMaxLength(nums));
    }
}
