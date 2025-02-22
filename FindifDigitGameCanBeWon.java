import java.util.Scanner;

class Live{
    public boolean canAlicewin(int[] nums){
        int singleDigitSum = 0 ; 
        int doubleDigitSum = 0 ; 
        boolean result = false;
        for(int i = 0 ; i < nums.length ; i ++){
            if (nums[i] > 9) {
                doubleDigitSum += nums[i]; 
            }
            if (nums[i] <= 9) {
                singleDigitSum += nums[i]; 
            }
        }
        if (doubleDigitSum > singleDigitSum || doubleDigitSum < singleDigitSum) {
            result = true; 
        }
        return result; 
    }
    public static void main(String[] args) {
        Live l = new Live();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size]; 
        for(int j = 0 ; j < size ; j ++){
            nums[j] = sc.nextInt(); 
        }
        System.out.println(l.canAlicewin(nums));
        sc.close();
    }
}