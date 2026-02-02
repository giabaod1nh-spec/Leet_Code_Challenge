import java.util.Scanner;

public class IsSubsequence_392 {
    public boolean isSubsequence(String s , String t){
        //c1: DUNG TWO POINTER
        int i = 0 ;
        int j = 0 ;
        int count = 0 ;
        for(j = 0 ; j < t.length() ; j++){
            if(t.charAt(j) == s.charAt(i)){
                 count++;
                 i++;
            }
        }
        return count == s.length();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi sub:");
        String s1 = sc.nextLine();
        System.out.println("Nhap chuoi cha:");
        String s2 = sc.nextLine();
        IsSubsequence_392 obj = new IsSubsequence_392();
        System.out.println(obj.isSubsequence(s1 , s2));
    }
}
