import java.math.*;


public class Slidingwindow {
    public static void main(String[] args) {
        int[] arr = {1,2,5,7,8,3};
        int k = 3;

        int sum = 0;
        for(int i = 0;i<k;i++){
            sum = sum + arr[i];

        }
        int max = sum;
        for(int i = k;i<arr.length;i++){
            sum = sum + (arr[i] - arr[i-k]);
           if(sum>max){
               max = sum;
           }
        }
        System.out.println(max);
    }
}

