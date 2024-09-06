import java.util.Scanner;

public class prefixSumArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter the size of the array: ");
        n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Before task the array is: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }

        for(int i=1; i<n; i++){
            arr[i]=arr[i-1]+arr[i];
        }

        System.out.println("After task the array is: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
