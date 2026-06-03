import java.math.*;

//kadane's algorithm - to find maximum sum of subarray in the array.
public class Kadane {

    public static void main(String[] args) {
        int[] arr = {-1,2,-4,5,9};
        int current = arr[0];
        int max = arr[0];
        for(int i = 1;i<arr.length;i++){
            current  = Math.max(arr[i],current+arr[i]);
            max = Math.max(max,current);
        }
        System.out.print("Maximum sum of subarray: " + max);
    }
}
