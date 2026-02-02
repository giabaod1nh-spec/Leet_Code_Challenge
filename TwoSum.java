import java.util.Arrays;
import java.util.Scanner;

class Solute{
    public int[] twoSum(int[] nums , int target){
        for 
        return new int[0]; 
    }
    public static void main(String[] args) {
        Solute s = new Solute(); 
        Scanner sc = new Scanner(System.in); 
        int target = sc.nextInt(); 
        sc.nextLine(); 
        int size = sc.nextInt(); 
        int[] nums = new int[size]; 
        for(int k =0 ; k < size ; k ++){
            nums[k] = sc.nextInt(); 
        }
        System.out.println(Arrays.toString(s.twoSum(nums, target)));
        sc.close();
    }
}