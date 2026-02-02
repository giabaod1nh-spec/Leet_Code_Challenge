import java.util.Arrays;
import java.util.Scanner;

class Bro{
    public int[] numberGame(int[] nums){
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length -1; i = i + 2){
            int temp = nums[i]; 
            nums[i] = nums[i+1]; 
            nums[i+1] = temp; 
        }
        return nums;
    }
    public static void main(String[] args) {
        Bro b = new Bro(); 
        Scanner sc = new Scanner(System.in); 
        int size = sc.nextInt();
        sc.nextLine();
        int[] nums = new int[size]; 
        for(int j = 0 ; j < size ; j ++){
            nums[j] = sc.nextInt(); 
        } 
        System.out.println(Arrays.toString(b.numberGame(nums)));
        sc.close();
    }
}