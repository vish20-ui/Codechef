import java.util.Scanner;


class bank{
    static void account(double amt, double bal) throws  Exception{
         if(amt > bal){
             throw new Exception("Insufficient bank balance");
         }
    }


}
public class Program4 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------Bank of Nigga-------------");
        System.out.print("Amount : ");
        double amt = sc.nextDouble();


        try{

           bank.account(amt,2000);
       }
       catch (Exception e){
           System.out.println("Error in Withdrawal: " + e.getMessage());
       }
        if(amt<2000){
        System.out.println("Transaction successful!");

        System.out.println("Balance: " + (2000 - amt));
            System.out.println("--------Thankyou visit again!--------");}

    }
}
