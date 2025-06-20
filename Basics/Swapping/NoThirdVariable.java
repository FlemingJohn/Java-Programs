public class NoThirdVariable {
    static void nothirdvariable(int[] values){
        values[0] = values[0] - values[1];

        values[1] = values[0] + values[1];

        values[0] = values[1] - values[0];
    }

    public static void main(String[] args) {
        int[] values = {9,6};

        nothirdvariable(values);

        System.out.println("Value of m is " + values[0] + " and Value of n is " + values[1]);
    }
}
