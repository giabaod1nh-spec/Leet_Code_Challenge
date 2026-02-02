import java.util.HashMap;
import java.util.Scanner;

public class RansomNote_383 {
    public boolean canConstruct(String ransomNote , String magazine){
        HashMap<Character , Integer> hashMap = new HashMap<>();
        for(char ransom : ransomNote.toCharArray()){
            hashMap.put(ransom , hashMap.getOrDefault(ransom , 0) + 1 );
        }

        for(char manga : magazine.toCharArray()){
            hashMap.put(manga , hashMap.getOrDefault(manga , 0) - 1 );
        }
        System.out.println(hashMap);
        for (char ransom : ransomNote.toCharArray()){
            if (hashMap.get(ransom) <= 0 ){
                return true;
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String ransomNote = sc.nextLine();
        String magazine = sc.nextLine();
        RansomNote_383 obj = new RansomNote_383();
        System.out.println(obj.canConstruct(ransomNote , magazine));
    }
}
