import java.util.Scanner;

public class Program19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();//ABC
        for(int i = 0;i<word.length();i++){
            char ch = word.charAt(i);

           if(ch >='A' && ch <='Z'){
                System.out.print( (ch - 'A' +1));
            }
            else if (ch >= 'a' && ch <='z'){
                System.out.print( (ch - 'a' + 1));
            }
            else{
               System.out.print(ch);
           }
        }

    }
}
