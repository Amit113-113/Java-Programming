import java.util.*;

public class practice {
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
        int num=sc.nextInt();
        int sum=0;
        // Approach 1
//        for(int i=n-1; i>=num; i--){
//            if(i==num-1){
//                if(arr[i]>sum){
//                    sum=arr[i];
//                }
//            }
//            else{
//                int a=arr[i] -arr[i-3];
//                if(sum<a){
//                    sum=a;
//                }
//            }
//        }

        // Approach 2
//        int temp=0;
//        for(int i=0; i<n-num;i++){
//            temp=arr[i]+arr[]
//        }

        System.out.println("The maximum sum of the substring with length 3 is: "+sum);
    }
}
