import java.util.*;
import java.math.BigInteger;
public class addNumberStrings {
    public static void main(String[] args) {
        String a= "12345555555555555";
        String b= "23455555555555555";
        BigInteger a1=new BigInteger(a);
        BigInteger b1=new BigInteger(b);
        BigInteger c= a1.add(b1);
        String ans=c.toString();
        System.out.println(ans);

    }
}
