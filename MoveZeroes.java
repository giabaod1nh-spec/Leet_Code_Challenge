import java.util.Arrays;
import java.util.Scanner;

class Learn{
    public void MoveZeroes(int[] nums){
        int i = -1 ; 
        int temp = 0 ; 
        for(int j = 0 ; j < nums.length ; ++j ){
            if (nums[j] != 0 ) {
                i++; 
                temp = nums[i]; 
                nums[i] = nums[j]; 
                nums[j] = temp ; 
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        Learn l = new Learn(); 
        Scanner sc = new Scanner(System.in); 
        int size = sc.nextInt(); 
        sc.nextLine(); 
        int[] nums = new int[size]; 
        for(int k = 0 ; k < size ; k++){
            nums[k] = sc.nextInt(); 
        }
        l.MoveZeroes(nums);
        sc.close();
    }
}