import java.util.Scanner;

public class sortArray01 {

    static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
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
        System.out.println("Before sort the array is: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        int a=0, b=n-1;
        while(a<b){
            if(arr[a]==1 && arr[b]==0){
                swap(arr,a,b);
                a++;
                b--;
            }
            if(arr[a]==0){
                a++;
            }
            if(arr[b]==1){
                b--;
            }
        }
        System.out.println("After sort the array is: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }

    }
}
