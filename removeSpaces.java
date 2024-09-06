import java.util.*;
import java.util.Map;

public class removeSpaces {
    public static void main(String[] args) {
        String a="I am Anirban Samanta. I love to play badminton.";
////        String[] b= a.split(" ");
////        StringBuilder c= new StringBuilder();
////        for(int i=0; i<b.length; i++){
////            c.append(b[i]);
////        }
//        String d= c.toString();
//        System.out.println(d);
        a=a.replaceAll("\\s","");
        System.out.println(a);
        System.out.println(a.isEmpty());


    }
}