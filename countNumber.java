import java.util.*;
public class countNumber {
    public static String count(String str){
        StringBuilder s=new StringBuilder();
        for(int i=0; i<str.length();i++){
            if(((int)str.charAt(i))>=97 && ((int)str.charAt(i))<=122){
                s.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                s.append(Character.toLowerCase(str.charAt(i)));
            }
        }
        String ans=s.toString();
        return ans;
    }
    public static void main(String[] args) {
        String s="bowANDarrow";
        System.out.println("Answer String is: "+ count(s));
    }
}
