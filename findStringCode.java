import java.util.*;
public class findStringCode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a= sc.nextLine();
        a=a.toLowerCase();

        String arr[]=a.split(" ");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        StringBuilder result=new StringBuilder();

        for(int i=0; i<arr.length; i++){
            int ans=0;
            int m=0, n=arr[i].length()-1;
            while(m<=n){
                int p=arr[i].charAt(m)-'a'+1;
                int q=arr[i].charAt(n)-'a'+1;
                if(m==n){
                    ans+=p;
                    break;
                }
                ans += Math.abs(p-q);
                m++;
                n--;
            }
            result.append(ans);
        }
        int mainAns=Integer.parseInt(result.toString());
        System.out.println(mainAns);
    }
}
