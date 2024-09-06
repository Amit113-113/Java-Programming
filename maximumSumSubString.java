import java.util.*;
public class maximumSumSubString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of elements of the array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=1; i<n; i++){
            arr[i]=arr[i]+arr[i-1];
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + "  ");
        }
        System.out.print("\nEnter the length of the substring: ");
        int k=sc.nextInt();
        int sum=0;
        int max=0;
        int i=0;
        int j=0;
        while(j<n){
            sum=sum+arr[j];
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                max=Math.max(max,sum);
                sum=sum-arr[i];
                i++;
                j++;
            }
        }

        System.out.println("The maximum sum of the substring with length 3 is: "+max);
    }
}
