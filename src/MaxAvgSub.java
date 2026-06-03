import java.util.*;


public class MaxAvgSub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
               int[] arr = {-1,3,-5,6,-4};
               int k = sc.nextInt();
               int sum = 0;
               for(int i = 0;i<k;i++){
                   sum = sum + arr[i];
               }
               int max  = sum;
         for(int i = k;i<arr.length;i++){
             sum = sum + arr[i] - arr[i-k];
              double avg = sum/k;
             System.out.println(avg);
         }
    }
}
