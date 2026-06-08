import java.util.Arrays;
import java.util.Scanner;

public class program7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int k = n;
        int st = 0;
        while(n>0){
            int a = n%10;
            st = st + (a*a*a);
            n = n/10;
        }
         System.out.println(st);
        if(st == k ){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
