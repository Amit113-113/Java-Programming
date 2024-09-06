import java.util.*;
public class practice1 {

    public static void printPrime(int n1, int n2){
        int max= Math.max(n1,n2);
        int min=Math.min(n1,n2);
        int[] arr=new int[max+1];

        for(int i=0; i<=max;i++ ){
            arr[i]=1;
        }
        if(min<2){
            arr[0]=0;
            arr[1]=0;
        }
        for(int i=2; i*i<=max; i++){
            if(arr[i]==1){
                for(int j=i*i; j<=max; j+=i){
                    arr[j]=0;
                }
            }
        }

        for(int i=min; i<=max; i++){
            if(arr[i]==1){
                System.out.println(i+" ");
            }
        }


    }

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        printPrime(a,b);

    }
}
