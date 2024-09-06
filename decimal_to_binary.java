import java.util.Scanner;
public class decimal_to_binary {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int rem=0, bin=0, place=1;
        while(num>0){
            rem=num%2;
            bin=bin+(rem*place);
            place= place* 10;
            num= num/2;
        }

        System.out.println(bin);

    }
}
