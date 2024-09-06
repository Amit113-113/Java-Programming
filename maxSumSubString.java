import java.util.*;
public class maxSumSubString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={6,1,7,5,3,2,4,8};
        int num=3;
        for(int i=1; i<arr.length; i++){
            arr[i]=arr[i]+arr[i-1];
        }
        
    }
}
