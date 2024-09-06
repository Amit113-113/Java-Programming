import java.util.*;
public class pallindromeString {
    public static void main(String[] args) {
        String str1="12321";
        int i=0;
        int j=str1.length()-1;
        int ans=1;
        while(i<j){
            if(str1.charAt(i++)!=str1.charAt(j--)){
                ans=0;
                break;
            }
        }
        if(ans==1){
            System.out.println("Pallindrome! ");
        }
        else{
            System.out.println("Not Pallindrome! ");
        }
    }
}
