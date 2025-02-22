
import java.util.Arrays;
import java.util.Scanner;

class Sigma{
    public int[] sortedSquares(int[] nums){
        int[] sortedNum = new int[nums.length]; 
        for(int i = 0 ; i < nums.length ; i++){ 
            sortedNum[i] = nums[i] * nums[i]; 
        }
        Arrays.sort(sortedNum);
        return sortedNum; 
    }
    public static void main(String[] args) {
        Sigma s = new Sigma(); 
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt(); 
        sc.nextLine(); 
        int[] nums = new int[size]; 
        for(int j = 0 ; j < size ; j ++){
            nums[j] = sc.nextInt();
        }
        System.out.println(Arrays.toString(s.sortedSquares(nums)));
        sc.close();
    }
}