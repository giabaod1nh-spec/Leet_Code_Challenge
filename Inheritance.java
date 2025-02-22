class UpCalc extends Calc {
    public int multi(int n1 , int n2){
        return n1 * n2; 
    }
    public int div( int n1 , int n2){
        return n1 / n2; 
    }
}

public class Inheritance {
    public static void main(String[] args) {
        UpCalc c = new UpCalc(); 
        c.add(0, 0);
        c.sub(0, 0);
        c.multi(0, 0);
        c.div(0, 0);
    


    }
}
