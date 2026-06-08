import java.util.*;

public class Program14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int[] arr = new int[n];
         for(int i = 0;i<n;i++){
             arr[i] = sc.nextInt();//5,0,6,1

         }
         int cnt = 0;

         for(int i = 0;i<n;i++){
             if(arr[i]!=0){
                 arr[cnt] = arr[i];
                 cnt++;
             }
         }
         for(int i = cnt;i<n;i++){
             arr[cnt] = 0;
             cnt++;
         }
        System.out.println(Arrays.toString(arr));
    }
}
