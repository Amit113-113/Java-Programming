import java.sql.SQLOutput;
import java.util.*;
public class anagram {
    public static void main(String[] args) {
        String a="SILENT";
        String b="LISTEN";
        char[] c=a.toCharArray();
        char[] d=b.toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);
        if(Arrays.equals(c,d)){
            System.out.println("The given string is Anagram.");
        }
        else{
            System.out.println("The given string is not an anagram.");
        }
    }
}
