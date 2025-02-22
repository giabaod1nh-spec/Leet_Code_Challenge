import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Qin{
    public List<Integer> findWordsContaining(String[] words , char x){
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0 ; i < words.length ; i ++){
            if(words[i].indexOf(x) >= 0 ){
                list.add(i);
            }
        }
        return list; 
    }
    public static void main(String[] args) {
        Qin q = new Qin(); 
        Scanner sc = new Scanner(System.in);
        char x = sc.next().charAt(0); 
        int size = sc.nextInt(); 
        sc.nextLine();
        String[] words = new String[size];
        for(int j = 0 ; j < size ; j ++){
            words[j] = sc.nextLine(); 
        }
        System.out.println((q.findWordsContaining(words, x)).toString());
        sc.close();
    }
}