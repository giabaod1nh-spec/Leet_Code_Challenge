import java.util.Scanner;

class Life{
    public int findNumbers(int[] nums){
        int count = 0 ; 
       for(int i = 0 ; i < nums.length ; i ++){
        String s = String.valueOf(nums[i]); 
        if (s.length() % 2 == 0) {
            count++; 
        }
       }
       return count; 
    }
    public static void main(String[] args) {
        Life l = new Life(); 
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size]; 
        for(int j = 0 ; j < size ; j ++){
            nums[j] = sc.nextInt();
        }
        System.out.println(l.findNumbers(nums));
        sc.close();
    }
}