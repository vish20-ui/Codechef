import java.util.*;
import java.math.*;


public class Program13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int p = sc.nextInt();
                int menuCount = 0;
                menuCount += p / 2048;
                p = p % 2048;
                while (p > 0) {
                    menuCount += p % 2;
                    p /= 2;
                }
                System.out.println(menuCount);
            }
        }
        sc.close();
    }
}
