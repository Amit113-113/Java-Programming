import java.util.*;
public class pavgram {
    public static void main(String[] args) {
        String a="The Quick Brown fox jumps over a lazy dog";
        String b=a.toUpperCase();
        int[] arr=new int[26];
        for(int i=0; i<b.length(); i++){
            if(b.charAt(i)==' '){
                continue;
            }
            else{
                arr[(int)(b.charAt(i)-'A')]++;
            }
        }
        int ans=1;
        for(int i=0; i<26; i++){
            if(arr[i]==0){
                ans=0;
            }
        }
        if(ans==1){
            System.out.println("Pengram");
        }
        else{
            System.out.println("Not a Pengram");
        }
    }
}
