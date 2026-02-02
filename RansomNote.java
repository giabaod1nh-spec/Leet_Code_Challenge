import java.util.Scanner;

class Super{
    public boolean canConstruct(String ransomNote , String magazine){
        boolean result = true; 
        for(int i = 0 ; i < ransomNote.length(); i ++){
            if(magazine.indexOf(ransomNote.charAt(i)) < 0  ){
                        result = false;  
            }
            magazine = magazine.substring(0, magazine.indexOf(magazine.charAt(i))) + magazine.substring((magazine.indexOf(ransomNote.charAt(i))) + 1); 
        }
        return result; 
    }
   public static void main(String[] args) {
    Super s = new Super(); 
    Scanner sc = new Scanner(System.in); 
    String ransomNote = sc.nextLine(); 
    String magazine = sc.nextLine(); 
    System.out.println(s.canConstruct(ransomNote, magazine));
    sc.close();
   }
}