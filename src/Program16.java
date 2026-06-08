import java.util.*;



public class Program16 {
   public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int[] arr = new int[n];
          for(int i =0;i<n;i++){
                arr[i] = sc.nextInt();//3,1,4,6

       }

          for(int i = 0;i<n-1;i++){
              for(int j = 0;j<n-1-i;j++) {
                  if (arr[j] > arr[j + 1]) {
                      int temp = arr[j];//3
                      arr[j] = arr[j+ 1];//1
                      arr[j + 1] = temp;//3
                  }
              }
          }
       System.out.println(Arrays.toString(arr));


    }
}
