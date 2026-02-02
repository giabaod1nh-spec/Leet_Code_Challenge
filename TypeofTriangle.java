import java.util.Scanner;

class Triangle{
    public String triangleType(int[] nums){
        String result = " "; 
        int i = 0 ; 
            if (nums[i] == nums[i + 1] && nums[i+1] == nums[i+2] && nums[i] == nums[i+2]) {
                result = "equilateral";
            }
            else if ((nums[i] + nums[i+1] > nums[i+2] && nums[i+1] + nums[i+2] > nums[i] && nums[i] + nums[i+2] > nums[i+1] ) && (nums[i] == nums[i+1] || nums[i+1] == nums[i+2] || nums[i] == nums[i+2])) {
                result = "isosceles";
            }
            else if (nums[i] + nums[i+1] > nums[i+2] && nums[i+1] + nums[i+2] > nums[i] && nums[i] + nums[i+2] > nums[i+1]) {
                result = "scalene";
            }else{
                result = "none" ; 
            }
        return result;    
    }
    public static void main(String[] args) {
        Triangle t = new Triangle();
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[3];
        for(int j = 0 ; j < 3 ; j ++){
            nums[j] = sc.nextInt();
        }
        System.out.println(t.triangleType(nums));
        sc.close();
    }
}