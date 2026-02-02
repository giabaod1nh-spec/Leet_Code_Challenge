import java.util.Scanner;

class Lor {
    public int sumOfGoodNumbers(int[] nums , int k ){
        int sum = 0 ; 
        for(int i = 0 ; i < nums.length ; i++){
            if (i - k < 0 && i + k >= nums.length ) {
                sum+= nums[i]; 
            }
            if( i - k >= 0 && i +k < nums.length){
                if(nums[i] > nums[i -k] && nums[i] > nums[i +k]){
                    sum += nums[i] ; 
                }
            }
            if( i - k < 0 && i + k < nums.length){
                if(nums[i] > nums[i + k]){
                    sum += nums[i] ; 
                }
            }
            if(i - k >= 0 && i + k >= nums.length){
                if(nums[i] > nums[i -k]){
                    sum += nums[i] ; 
                } 
            }
        }
        return sum; 
    }
    public static void main(String[] args) {
        Lor l  = new Lor(); 
        Scanner sc = new Scanner(System.in); 
        int size = sc.nextInt(); 
        int[] nums = new int[size]; 
        for(int k = 0 ; k < size ; k ++){
            nums[k] = sc.nextInt(); 
        }
        int k = sc.nextInt(); 
        System.out.println(l.sumOfGoodNumbers(nums, k));
        sc.close();
    }
}