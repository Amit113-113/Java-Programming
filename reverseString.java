import java.util.*;
public class reverseString {
    public static void main(String[] args) {
        String str1="Anirban Samanta";

        char[] arr1= str1.toCharArray();
        int len=str1.length();
        int a=len;
        char[] arr2= new char[a];
        a--;
        for(int i=0; i<len; i++){
            arr2[a--]=arr1[i];
        }
        String str2="";
        str2=str2.copyValueOf(arr2);
        System.out.println(arr2);
    }
}
