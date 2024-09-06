import java.util.Scanner;
import java.util.Arrays;

public class kthReverseArray {

    static void reverseArray(int[] arr, int i, int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
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
        System.out.println("Enter the number of rotation: ");
        int k=sc.nextInt();
        k=k%n;
        System.out.println("Before rotation the array is: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }

        reverseArray(arr, 0, n-k-1);
        reverseArray(arr, n-k, n-1);
        reverseArray(arr, 0, n-1);

        System.out.println("After rotation the array is: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }

    }
}
