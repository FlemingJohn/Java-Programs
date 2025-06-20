public class CheckNeonNumber {

    public static boolean checkNeon(int num) {

        int square = num * num;

        int sum = 0;

        while(square > 0){

            int remainder = square % 10;

            sum += remainder ;

            square = square / 10;
        }
        
        if(sum == num){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {

        int n = 9;

        if(checkNeon(n)){
            System.out.println("It is an Neon Number");
        }

        else{
            System.out.println("Not an neon number");
        }
        
    }
}