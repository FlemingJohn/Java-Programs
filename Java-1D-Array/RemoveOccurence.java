import java.util.Arrays;

public class RemoveOccurence {

    public static int []removeElements(int arr[], int key){

        int left = 0;
        
        for(int right = 0;right<arr.length;right++){
            if (arr[right] != key){
                arr[left] = arr[right];
                left += 1;
            }            
        }
        
        return Arrays.copyOf(arr, left);

    }
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,8,9,120};
        int k = 3;
        arr = removeElements(arr, k);
        System.out.println(Arrays.toString(arr));
    }
}