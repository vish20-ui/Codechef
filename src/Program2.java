import java.util.*;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          if(n==0 || n==1){
              System.out.println("Factorial: " + "1");
          }
          int result = 1;
          for(int i =2;i<=n;i++ ){
              int sum = 0;
              for(int j = 0;j<i;j++){
                  sum = sum + result;
              }
              result = sum;
          }
        System.out.println(result);
    }
}
