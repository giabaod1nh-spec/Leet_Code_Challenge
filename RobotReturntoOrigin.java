import java.util.Scanner;

class Gaming{
    public boolean judgeCircle(String moves){
        int updown = 0 ; 
        int leftright = 0 ; 
        boolean result = false; 
        for(int i = 0 ; i < moves.length(); i++){
            if (moves.charAt(i) == 'U') {
                updown += 1; 
            }
            if (moves.charAt(i)  == 'D') {
                updown -=1 ; 
            }
            if (moves.charAt(i) == 'L') {
                leftright +=1 ; 
            }
            if (moves.charAt(i) == 'R') {
                leftright -=1 ; 
            }
        }
        if (updown == 0 && leftright == 0) {
            result = true;
        }
        return result;
    }
    public static void main(String[] args) {
        Gaming g = new Gaming();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(g.judgeCircle(s));
        sc.close();
    }
}