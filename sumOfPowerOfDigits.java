import java.util.*;
public class sumOfPowerOfDigits {
    public static void main(String[] args) {
        int num=582109;
        int rev=0;
        while(num>0){
            int temp=num%10;
            rev= rev*10 + temp;
            num=num/10;

        }
        int ans=0;
        int a=0, b=0;
        while(rev>0){
            a=rev%10;
            b=(rev/10)%10;
            ans+= Math.pow(a,b);
            rev=rev/10;
        }
        System.out.println(ans);
    }
}
