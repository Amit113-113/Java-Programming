import java.util.*;
public class trimString {
    public static void main(String[] args) {
        String a="   hello user welcome   ";
        char[] b=a.toCharArray();
        int start=0;
        int end=a.length()-1;
        int count=0;
        for(int i=0; i<b.length; i++){
            if(b[i]!=' '){
                start=i;
                break;
            }
        }
        for(int i=b.length-1; i>=0; i--){
            if(b[i]!=' '){
                end=i;
                break;
            }
        }
        count= end-start+1;
        String result= new String(b, start, count);
        System.out.println(result);
        String result2=a.substring(start,end+1);
        System.out.println(result2);

    }
}
