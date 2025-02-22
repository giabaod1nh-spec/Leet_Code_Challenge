import java.util.Arrays;
import java.util.Scanner;

class Slave{
    public int[] plusOne(int[] digits){
        for(int i = digits.length - 1; i >= 0 ; i -- ){
                    if (digits[i] < 9 ) {
                        digits[i]++; 
                        return digits; 
                    }
                    digits[i] = 0  ; 
        }
        digits = new int[digits.length + 1]; 
        digits[0] = 1 ; 
        return digits; 
    }
    public static void main(String[] args) {
        Slave s = new Slave(); 
        Scanner sc = new Scanner(System.in); 
        int size = sc.nextInt(); 
        sc.nextLine(); 
        int[] digits = new int[size]; 
        for(int j = 0 ; j < size; j ++){
            digits[j] = sc.nextInt(); 
        }
        System.out.println(Arrays.toString(s.plusOne(digits)));
        sc.close();
    }
}