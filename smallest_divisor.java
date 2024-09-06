import java.util.Scanner;
public class smallest_divisor {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int ans=0;
        for(int i=2; i<num/2; i++){
            if(num%i==0){
                ans=i;
                break;
            }
        }
        System.out.println(ans);
    }
}
