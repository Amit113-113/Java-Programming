import java.util.Scanner;

public class equalPartitionOfSum {

    static boolean equalSumPartition(int[] arr){
        for(int i=1; i<arr.length; i++){
            arr[i]=arr[i-1]+arr[i];
        }
        int n=arr.length;
        int a=arr[n-1];
        for(int i=0; i<=n-2;i++){
            int suffixSum= a-arr[i];
            if(suffixSum==arr[i]){
                return true;
            }
        }
        return false;

    }

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

        System.out.println("\nThe answer is: "+ equalSumPartition(arr));
    }
}
