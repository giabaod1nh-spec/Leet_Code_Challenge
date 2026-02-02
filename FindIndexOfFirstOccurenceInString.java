import java.util.Scanner;

class Feel{
    public int strStr(String haystack , String needle){
        int appear = 0 ; 
        appear = haystack.indexOf(needle); 
        return appear;
    }
    public static void main(String[] args) {
        Feel f = new Feel(); 
        Scanner sc = new Scanner(System.in); 
        String haystack = sc.nextLine(); 
        String needle = sc.nextLine(); 
        System.out.println(f.strStr(haystack, needle));
        sc.close();
    }
}