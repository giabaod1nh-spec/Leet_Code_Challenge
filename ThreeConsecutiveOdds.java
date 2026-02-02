import java.util.Scanner;

class Painful{
    public boolean threeConsecutiveOdds(int[] arr){
        boolean status = false ; 
        for(int i = 0 ; i < arr.length - 2 ; i ++){
            if (arr[i] % 2 != 0 && arr[i + 1] % 2 != 0 && arr[i+2] % 2 != 0 ) {
                status = true ; 
            }
        }
        return status;
    }
    public static void main(String[] args) {
        Painful p = new Painful();
        Scanner sc = new Scanner(System.in); 
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ; i < size ; i ++){
            arr[i] = sc.nextInt();
        }
        System.out.println(p.threeConsecutiveOdds(arr));
        sc.close();
    }
}