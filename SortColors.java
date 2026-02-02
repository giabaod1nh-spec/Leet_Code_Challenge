
import java.util.Arrays;
import java.util.Scanner;

class Leo{
    public void setColors(int[] nums){
        int zeroes = 0 ; int ones = 0 ;
        for(int num : nums){
            if (num == 0) {
                zeroes++; 
            }
            if (num == 1) {
                ones++; 
            }
        }
        for(int i = 0 ; i < zeroes ; i ++){
            nums[i] = 0 ; 
        }
        for(int j = zeroes; j < zeroes + ones; j ++){
            nums[j] = 1 ;
        }
        for(int k = zeroes + ones; k < nums.length; k++){
            nums[k] = 2;
        }
        }
        public static void main(String[] args) {
            Leo l = new Leo(); 
            Scanner sc = new Scanner(System.in); 
            int size = sc.nextInt(); 
            sc.nextLine(); 
            int[] nums = new int[size]; 
            for(int h = 0 ; h < size ; h++){
                nums[h] = sc.nextInt(); 
            }
            l.setColors(nums); 
            System.out.println(Arrays.toString(nums));
            sc.close();
        }
    }
