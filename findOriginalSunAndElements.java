public class findOriginalSunAndElements {
    public static void main(String[] args) {
        int[] arr={7,6,8,16,12,3};
        int[] ans= new int[arr.length];
        ans[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2; i>=0; i--){
            ans[i]=arr[i]-ans[i+1];
        }
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i]+"  ");
        }
    }
}
