import java.util.*;
public class reverseIndivisualWordsOfString {
    public static void main(String[] args) {
        String a= "My name is Anirban Samanta";
        String[] b=a.split(" ");
        StringBuilder c= new StringBuilder();
        for(int i=0; i<b.length; i++){
            StringBuilder d= new StringBuilder();
            d.append(b[i]);
            d.reverse();
            String e=d.toString();
            c.append(e);
            if(i<b.length-1){
                c.append(" ");
            }
        }
        String f=c.toString();
        System.out.println(f);
    }
}
