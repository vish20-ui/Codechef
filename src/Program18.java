import java.util.Arrays;
import java.util.Scanner;

public class Program18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String words = "anieare";
       int cnt = 0;
       int cont = 0;
       for(int i = 0;i<words.length();i++){
           if(words.charAt(i) == 'a' || words.charAt(i) == 'e' || words.charAt(i) == 'i' || words.charAt(i) == 'o' || words.charAt(i) == 'u' ){
               cnt++;
           }
           else{
               cont++;
           }
       }
        System.out.println("Vowels:" + cnt);
        System.out.println("Consonants: " + cont);
    }
}
