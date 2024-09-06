import java.util.*;
public class getCodeThroughStrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a= sc.nextLine();

        String arr[]=a.split(" ");

        int ans=0;
        for(int i=0; i<arr.length; i++){
            ans+= arr[i].length();
        }
        while(ans>=10){
            int c=0;
            while(ans>0){
                c+=ans%10;
                ans/=10;
            }
            ans=c;
        }
        System.out.println(ans);
    }
}