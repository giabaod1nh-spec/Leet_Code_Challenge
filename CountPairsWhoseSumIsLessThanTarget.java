import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class Solo{
    public int countPairs(List<Integer> nums , int target){
        int count = 0 ;
        for(int i = 0 ; i < nums.size() ; i ++){
            for(int j = 0 ; j < nums.size() ; j ++){
                if(i < j && (nums.get(i) + nums.get(j)) < target){
                    count ++; 
                }
            }
        }
        return count; 
    }
    public static void main(String[] args) {
        Solo s = new Solo(); 
        Scanner sc = new Scanner(System.in); 
        List<Integer> nums = new ArrayList<Integer>(); 
        int numsSize = sc.nextInt(); 
        for(int k = 0 ; k < numsSize ; k ++){
                nums.add(sc.nextInt()); 
        }
        int target = sc.nextInt(); 
        sc.nextLine(); 
        System.out.println(s.countPairs(nums, target));
        sc.close();
    }
}