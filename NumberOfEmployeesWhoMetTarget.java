import java.util.Scanner;

class Lord{
    public int numberOfEmployeesWhoMetTheTarget(int[] hour , int target){
        int count = 0 ; 
        for(int i = 0 ; i < hour.length ; i++){
            if(hour[i] >= target){
                count++; 
            }
        }
        return count; 
    }
    public static void main(String[] args) {
        Lord l = new Lord(); 
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int size = sc.nextInt();
        int[] hour = new int[size]; 
        for(int j = 0 ; j < size ; j ++){
            hour[j] = sc.nextInt(); 
        }
        System.out.println(l.numberOfEmployeesWhoMetTheTarget(hour, target));
        sc.close();
    }
}