import java.util.*;
public class mostFrequentlyOccuringDiigit {
    public static void main(String[] args) {
        int input1[]={1237, 262, 666, 140};
        int[] arr= new int[10];
        for(int i=0; i<input1.length; i++){
            while(input1[i]>0){
                arr[input1[i]%10]++;
                input1[i] = input1[i]/10;
            }
        }
        int max=0,index=-1;
        for(int i=0; i<arr.length;i++){
            if(arr[i]>=max){
                max=arr[i];
                index=i;
            }
        }
        System.out.println(index);
    }
}
