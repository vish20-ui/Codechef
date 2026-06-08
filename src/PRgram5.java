import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PRgram5 {
    public static void main(String[] args){
         String code = "vishwa2005@gmail.com";
        Pattern pat = Pattern.compile("^[a-zA-Z0-9.]+@[A-Za-z0-9.]+$");
        Matcher mat = pat.matcher(code);
        if(mat.matches()){
            System.out.println("Yes its a perfect code!");
        }
        else{
            System.out.println("No its a mismatch!");
        }

    }
}
