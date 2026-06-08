public class Program15 {
   public static void main(String[] args) {
       int number = 13;
       int store = 0;
       for(int i = 3;i>=0;i-- ){
           int bit = (number >>i) & 1;
           System.out.print(bit);


       }
       System.out.println(store);

    }
}
