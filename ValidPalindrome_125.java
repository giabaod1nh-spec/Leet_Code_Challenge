import java.util.Scanner;

public class ValidPalindrome_125 {
    public boolean isPalindrome(String s){
        String filtered = s.replaceAll("[^a-zA-Z0-9]" , "").toLowerCase();
        //Loai bo het cac ki tu ko giong trong regex
        StringBuilder newString = new StringBuilder(filtered);
        newString.reverse();
        return newString.toString().equals(filtered);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        ValidPalindrome_125 obj = new ValidPalindrome_125();
        System.out.println(obj.isPalindrome(s));
    }
}
