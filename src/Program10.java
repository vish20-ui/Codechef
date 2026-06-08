import java.util.Arrays;
import java.util.Scanner;

public class Program10 {
    public static int[] two(int[] arr, int tar){

        int l = 0;
        int r = arr.length -1;
        while(l<r){
            int k = arr[l] + arr[r];
            if( k == tar){
                return new int[]{l,r};
            }
            else if(k < tar){
            l++;}
            else if(k > tar){
            r--;}
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

         int[] arr = {1,4,5,6};
         int tar = 10;
        int[] result = two(arr,tar);
        System.out.println(Arrays.toString(result));
    }
}
