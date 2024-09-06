import java.util.*;
public class rotationCheck {
    public static void main(String[] args) {
        String a= "I am Anirban Samanta";
        StringBuilder b= new StringBuilder(a);
        b.reverse();
        String c=b.toString();
        c = c+'a';
        if(a.length()!= c.length()){
            System.out.println("Not Possible!");
            System.exit(0);
        }
        else{
            int j=a.length()-1;
            for(int i=0; i<a.length(); i++){
                if(a.charAt(i)!= c.charAt(j--)){
                    System.out.println("Not Possible!");
                    System.exit(0);
                }
            }
        }
        System.out.println("Rotation Possible!");
    }
}
