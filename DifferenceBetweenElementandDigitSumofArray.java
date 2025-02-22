import java.util.Scanner;

class War{
    public int differenceofSum(int[] nums){
        int elementSum = 0 ; 
        int digitSum = 0 ; 
        int temp = 0 ; 
        for(int i = 0 ; i < nums.length ; i ++){
            elementSum += nums[i]; 
            while (nums[i] > 9) {
                temp = nums[i] % 10 ; 
                digitSum += temp;
                nums[i] /= 10 ;  
            }
            if (nums[i] <= 9) {
                digitSum += nums[i]; 
            }
        }
        return Math.abs(elementSum - digitSum);
    }
    public static void main(String[] args) {
        War w = new War(); 
        Scanner sc = new Scanner(System.in); 
        int size = sc.nextInt();
        int[] nums = new int[size]; 
        for(int j = 0 ; j < size; j ++){
            nums[j] = sc.nextInt();
        }
        System.out.println(w.differenceofSum(nums));
        sc.close();
    }
}