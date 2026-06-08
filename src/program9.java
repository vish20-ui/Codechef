import java.util.ArrayList;
import java.util.*;

public class program9 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       List<Integer> arr = new ArrayList<>();
       for(int i = 0;i<n;i++){
           arr.add(sc.nextInt());
       }

        System.out.println( arr.get(1));

    }
}
