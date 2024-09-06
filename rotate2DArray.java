import java.util.*;

public class rotate2DArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter the number of rows and column: ");
        a=sc.nextInt();
        b=sc.nextInt();

        int arr[][] = new int[a][b];

        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                arr[i][j]=sc.nextInt();
            }
        }

        for(int i=0; i<a; i++){
            for(int j=i; j<b; j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for(int i=0; i<a; i++){
            int m=0;
            int n=b-1;
            while(m<n){
                int temp=arr[i][m];
                arr[i][m]= arr[i][n];
                arr[i][n]=temp;
                m++;
                n--;
            }
        }

        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }

    }
}
