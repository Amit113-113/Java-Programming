import java.util.*;
public class deleteOccurenceChar {
    public static void main(String[] args) {
        String a="SPIDERLIES";
        char b='I';
        String c="";
        c+=b;
        a=a.replaceAll(c,"");
        System.out.println(a);
    }
}
