import java.util.Scanner;
class Simple {
    public String firstPalindrome(String[] words){
        for(String word : words){
            StringBuilder reversed = new StringBuilder(word).reverse();
            if (word.equals(reversed.toString())) {
                return word; 
            }
        } 
        return ""; 
    }
    public static void main(String[] args) {
        Simple s = new Simple(); 
        Scanner sc = new Scanner(System.in); 
        int size = sc.nextInt();
        sc.nextLine();
        String[] words = new String[size]; 
        for(int j = 0 ; j < size ; j ++){
            words[j] = sc.nextLine(); 
        }
        System.out.println(s.firstPalindrome(words));
        sc.close();
    }
}