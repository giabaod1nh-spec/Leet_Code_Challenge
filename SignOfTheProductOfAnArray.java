import java.util.Scanner;

class Solomon{
    public int arraySign(int[] nums){
        int productSign = 1 ; 
        for(int i : nums){
            if (i < 0) {
                productSign *= -1 ; 
            }else if (i == 0 ) {
                productSign = 0 ;
                break ;  
            }
        }
        return productSign; 
    }
    public static void main(String[] args) {
        Solomon s = new Solomon(); 
        Scanner sc = new Scanner(System.in); 
        int size = sc.nextInt(); 
        sc.nextLine(); 
        int[] nums = new int[size]; 
        for(int j = 0 ; j < size ; j ++){
            nums[j] = sc.nextInt(); 
        }
        System.out.println(s.arraySign(nums));
        sc.close();
    }
}