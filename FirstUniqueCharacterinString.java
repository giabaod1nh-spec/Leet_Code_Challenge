import java.util.Scanner;

class HardLive{ 
    public int firstUniqChar(String s){
        int result = -1 ; 
        for(int i = 0 ; i < s.length(); i++){
            char ch = s.charAt(i); 
            if (s.indexOf(ch) == s.lastIndexOf(ch)) {
                 result = s.indexOf(ch);
                 break; 
            }
        }
        return result;  
    }
    public static void main(String[] args) {
        HardLive h = new HardLive(); 
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(h.firstUniqChar(s));
        sc.close();
    }
}