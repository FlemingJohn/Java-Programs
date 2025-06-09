import java.util.*;

class ThirdVariable{

    static void thirdvariable(int m, int n){
        // third varible -> temp(which is called temporay varible to store the actual data)
        int temp = m;
        m = n;
        n = temp;
        System.out.println("value of m is "+ m +"and Value of n is "+ n);

    }

    public static void main(String[] args){

        int m = 9;
        int n = 5;

        thirdvariable(m, n);
    }
}