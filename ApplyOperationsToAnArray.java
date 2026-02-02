import java.util.Arrays;
import java.util.Scanner;

class Nigger{
    public int[] applyOperations(int[] nums){
            for(int i = 0 ; i < nums.length - 1;i++){
                    if(nums[i] == nums[i+1]){
                        nums[i] = nums[i] * 2 ; 
                        nums[i+1] = 0 ;                     }
            }
            int j = -1 ; 
            for(int l = 0 ; l < nums.length ; l ++){
                if(nums[l] != 0){
                    j++; 
                    int temp = nums[j] ; 
                    nums[j] = nums[l]; 
                    nums[l] = temp ; 
                }
            }
            return nums; 
    }
    public static void main(String[] args) {
        Nigger n = new Nigger(); 
        Scanner sc = new Scanner(System.in); 
        int size = sc.nextInt(); 
        sc.nextLine();
        int[] nums = new int[size]; 
        for(int k = 0 ; k < size ; k ++){
            nums[k] = sc.nextInt(); 
        }
        System.out.println(Arrays.toString(n.applyOperations(nums)));
        sc.close();
    }
}