import java.util.Scanner;

public class evenseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum=0;

          while(true){
              int num = sc.nextInt();

              if(num==-1){
                  break;
              }
              if(num%2==0){
                  sum = sum + num;
              }
          }
        System.out.println(sum);
    }
}
