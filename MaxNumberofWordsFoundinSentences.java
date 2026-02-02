import java.util.Scanner;
class Painless{
    public int mostWordsFound(String[] sentences){
        int result = 0 ; 
        String temp;
        for(int i = 0 ; i < sentences.length; i++){
            temp = sentences[i]; 
            int count = 0 ;
            for(int j = 0 ; j < temp.length() ; j ++){  
                if(temp.charAt(j) == ' '){
                    count++;
                }
            }
            if (count > result) {
                result = count;
            }
        }
        return result + 1 ; 
    }
    public static void main(String[] args) {
        Painless p = new Painless(); 
        Scanner sc = new Scanner(System.in); 
        int size = sc.nextInt(); 
        sc.nextLine();
        String[] sentences = new String[size];  
        for(int j = 0 ; j < size; j ++){
            sentences[j] = sc.nextLine(); 
        }
        System.out.println(p.mostWordsFound(sentences));
        sc.close();
    }    
}