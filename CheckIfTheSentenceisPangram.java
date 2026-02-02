import java.util.Scanner;

class Shape{
    public boolean checkIfPangram(String sentence){
        boolean check = false; 
        if(sentence.length() < 26){
                check = false; 
        }
        for(char ch = 'a' ; ch <= 'z' ; ch++){
            if(sentence.indexOf(ch) > 0 ){
                check = true ; 
            }else{
                check = false; 
                break;
            }
        }
        return check;
    }
    public static void main(String[] args) {
        Shape s = new Shape(); 
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        System.out.println(s.checkIfPangram(sentence));
        sc.close();
    }
}