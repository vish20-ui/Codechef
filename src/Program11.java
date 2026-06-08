import java.util.*;


public class Program11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       System.out.println("Length: ");
       int n = sc.nextInt();
       int[] arr = new int[n];
        System.out.println("Elements: ");

        for(int i = 0;i<n;i++){
           arr[i] = sc.nextInt();
       }
       int l = 0;
       int r = arr.length - 1;
       while(l<r){
           int temp = arr[l];
           arr[l] = arr[r];
           arr[r] = temp;
           l++;
           r--;
       }

       System.out.println(Arrays.toString(arr));
    }
}
