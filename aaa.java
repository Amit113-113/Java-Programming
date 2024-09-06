public class aaa {
    public static void main(String[] args){
        int ans=999911;
        while(ans>=10){
            int c=0;
            while(ans>0){
                c+=ans%10;
                ans/=10;
            }
            ans=c;

        }
        System.out.println(ans);
    }
}
