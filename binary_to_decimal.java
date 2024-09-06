import java.util.Scanner;
import java.lang.Math;
public class binary_to_decimal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int bin= sc.nextInt();
        int dec=0;
        int n=0;
        while(bin>0){
            int a=bin%10;
            int b=(int)Math.pow(2,n);
            dec=dec+a*b;
            n++;
            bin=bin/10;
        }
        System.out.println(dec);
    }
}
