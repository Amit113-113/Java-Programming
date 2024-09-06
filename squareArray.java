import java.util.Scanner;
import java.lang.Math;

public class squareArray {
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

        int[] ans=new int[n];
        int j=n-1;
        int left=0,right=n-1;
        while(left<=right){
            int a=Math.abs(arr[left]);
            int b=Math.abs(arr[right]);
            if(a>b){
                ans[j]=(int)Math.pow(a,2);
                left++;
            }
            else{
                ans[j]=(int)Math.pow(b,2);
                right--;
            }
            j--;
        }


        System.out.println("After sort the array is: ");
        for(int i=0; i<n; i++){
            System.out.print(ans[i]+ " ");
        }
    }
}
