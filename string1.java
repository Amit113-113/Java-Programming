import java.util.*;
public class string1 {
    public static void main(String[] args) {
//        String a= "AB";
//
//        String c="AB";
//        String b=a.concat("ABC");
//        //System.out.println(c.compareTo(a));
//        char []cv={'b','o','y'};
//        String d=null;
//        d.copyValueOf(cv);
//        System.out.println(d);

        char[] myStr1 = new char[10];
        String myStr2 = "hello";
        //myStr2 = myStr2.copyValueOf(myStr1,0,5);
        String x= new String(myStr2);
        System.out.println("Returned String: " + x);

    }
}
