import java.io.*;

public class RotateArray {

    static void Rotate(int arr[], int size, int rotation){
       
        int n = size;
       
        int temp_arr[] = new int[n];

        int k = 0;

    

        for(int i = rotation; i<n;i++){
            temp_arr[k] = arr[i];
            k++;
        }

        for(int i = 0;i<rotation;i++){
            temp_arr[k] = arr[i];
            k++;
        }

        for(int i = 0; i<n;i++){
            arr[i] = temp_arr[i];
        }
    }
    static void print(int arr[], int n){
        for(int i = 0; i<n;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int size = arr.length;
        int rotation = 2;
        Rotate(arr,size,rotation);
        print(arr,size);
    }
}