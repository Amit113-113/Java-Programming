import java.util.*;
public class lowerToUppercase {
    public static void main(String[] args) {
        String str="i am anirban Samanta. I live in haldia.";
        char[] str1=str.toCharArray();
        if(str==""){
            System.out.println("Nothing to do");
        }
        else{
            if((int)str1[0]>=97 && (int)str1[0]<=122){

                str1[0]=(char)(str1[0]-32);
            }
            for(int i=0; i<str1.length; i++){
                if(str1[i]==' '){
                    if((int)str1[i+1]>=97 && (int)str1[i+1]<=122){
                        str1[i+1]=(char)(str1[i+1]-32);
                    }
                }
            }
        }
        String ans="";
        ans=ans.copyValueOf(str1);
        System.out.println(ans);
    }
}



