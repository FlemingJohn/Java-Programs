import java.util.Arrays;

public class MergeArrays {

    public static void main(String[] args) {
        
        int arr1[] = {10,20,30};
        int arr2[] = {40,50,60,70,80};

        int a1 = arr1.length;
        int b1 = arr2.length;

        int c1 = a1 + b1;

        int[] c = new int[c1];

        // loop to store the element of first array
        for(int i =0;i<a1;i++){
            c[i] = arr1[i];
        }

        // loop to store the element of second array
        for(int i =0; i< b1;i++){
            c[a1+i] = arr2[i];
        }
        System.out.println(Arrays.toString(c));
    }
}