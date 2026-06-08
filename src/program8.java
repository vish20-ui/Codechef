import java.util.HashMap;

public class program8 {
    public static void main (String[] args){

       int[] arr  = {4,5,54,5,1};
       int tar = 10;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i= 0;i<arr.length;i++){
            if(map.containsKey(tar - arr[i])){
                int frst = map.get(tar - arr[i]);
                int sec = i;
                System.out.println(frst + " " + sec);
            }
            map.put(arr[i],i);
        }

    }
}
