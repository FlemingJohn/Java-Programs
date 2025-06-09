public class Operator {
    public static void operator(int m, int n){
        m = m ^ n;

        n = m ^ n;

        m = m ^ n;

        System.out.println("Value of m is " + m
                           + " and Value of n is " + n);
    }

    public static void main(String[] args) {
        
        int m = 9; 
        int n = 5;

        operator(m, n);
    }
}
