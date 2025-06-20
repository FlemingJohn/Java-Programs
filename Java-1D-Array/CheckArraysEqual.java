import java.util.Arrays;

public class CheckArraysEqual {

    static void check(int a[], int b[]){
        
        boolean result = false;

        if(a.length == b.length){
            for(int i =0; i < a.length;i++){
                if(a[i] != b[i]){

                    result = false;
                    break;
                }
            }
        }
        else{
            result = false;
        }
        if(result){
            System.out.println("Equal");
        }
        else{
            System.out.println("not equal");
        }
    }
    public static void main(String[] args) {
        int a[] = {10,20,30};
        int b[] = {10,20,30};

        check(a, b);
    }
}