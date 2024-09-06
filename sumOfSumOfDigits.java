import java.util.*;
public class sumOfSumOfDigits {
    public static void main(String[] args){
        int num=582109;
        int a=num;

        int count=0;

        int finalSum=0;
        while(a>0){
            count+=1;
            a= a/10;
        }
        int rev=0;
        while(num>0){
            int temp=num%10;
            rev= rev*10 + temp;
            num=num/10;

        }

        for(int i=1; i<=count; i++){
            int b=rev;
            int sum=0;
            while(b>0){
                sum+=b%10;
                b=b/10;
            }
            finalSum+=sum;
            rev= rev/10;
        }
        System.out.println(finalSum);
    }
}
