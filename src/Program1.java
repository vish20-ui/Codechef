
class calculator{

 int sum(int a, int b){
     System.out.println("The sum: " + (a + b));
     return a+b;
 }

}
public class Program1 {
    public static void main(String[] args){

        calculator c = new calculator();
        c.sum(2,4);



    }
}
