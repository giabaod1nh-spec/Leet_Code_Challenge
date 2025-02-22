import java.util.Scanner;

class Pain{
    public int countKeyChanges(String s){
        s = s.toLowerCase(); 
        int count = 0 ; 
        for(int i = 0 ; i < s.length() -1 ; i ++){
            if (s.charAt(i) != s.charAt(i + 1)) {
                count++; 
            }
        }
        return count; 
    }
    public static void main(String[] args) {
        Pain p = new Pain(); 
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); 
        System.out.println(p.countKeyChanges(s));
        sc.close();
    }
}