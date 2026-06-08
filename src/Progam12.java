import java.util.*;

public class Progam12 {

    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       char[] arr = new char[n];
       System.out.println("Characters: ");
       for(int i = 0;i<n;i++){
           arr[i] = sc.next().charAt(0);
       }

       int s =0;
       for(int i = 0;i<arr.length;i++){
           s = s+  arr[i] - 'A' +1;
       }
       System.out.println("Sum: ");
         System.out.println(s);
    }
}
