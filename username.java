import java.util.*;
public class username {
    public static void main(String[] args) {
        String a="rah23ul";
        int count=0;
        for(int i=0; i<a.length();i++){
            if(((int)a.charAt(i))>=97 && ((int)a.charAt(i))<=122){
                continue;
            }
            else{
                count++;
            }
        }
        System.out.println("The output will be: "+count);
    }
}
