class AddBinValues{
    
    static String  addbinary(String x, String y){
        int num1 = Integer.parseInt(x,2);

        int num2 = Integer.parseInt(y,2);

        int sum = num1 + num2;

        String result = Integer.toBinaryString(sum);

        return result;
    }

    public static void main(String[] args) {
        String x = "011011";

        String y = "1010111";

        System.out.println(addbinary(x, y));
    }
}