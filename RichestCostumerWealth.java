import java.util.Scanner;

class Game{
    public int maximumWealth(int[][] accounts){
        int richest = 0;
        for(int i = 0 ; i < accounts.length ; i ++){
            int sum = 0 ; 
            for(int j = 0 ; j < accounts[0].length ; j ++){
                sum+= accounts[i][j]; 
            }
            if(sum > richest){
                richest = sum; 
            }
        }
        return richest; 
    }
    public static void main(String[] args) {
        Game g = new Game(); 
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); 
        sc.nextLine();
        int y = sc.nextInt();
        sc.nextLine(); 
        int[][] accounts = new int[x][y]; 
        for(int l = 0 ; l < x ; l ++){
            for(int k = 0 ; k < y ; k++){
                accounts[x][y] = sc.nextInt(); 
            }
        }
        System.out.println(g.maximumWealth(accounts));
        sc.close();
    }
}