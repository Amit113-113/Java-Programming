import java.util.*;
public class printFirstCharacterOfEveryWord {
    public static void main(String[] args) {
        String a="I am Anirban Samanta";
        String[] b=a.split(" ");
        for(int i=0; i<b.length; i++){
            System.out.print(b[i].charAt(0)+ " ");
        }
    }
}
