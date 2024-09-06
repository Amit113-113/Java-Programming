public class pattern5 {
    public static void main(String[] args){
        for(int i=1; i<=10; i++){
            if(i==10){
                for(int m=1; m<=9; m++){
                    System.out.print(m);
                }
                System.out.print("1");
                for(int n=9; n>=1; n--){
                    System.out.print(n);
                }
            }

            else{
                for(int j=1; j<=10-i; j++){
                    System.out.print(" ");
                }
                for(int k=1; k<=i; k++){
                    System.out.print(k);
                }
                for(int l=i-1; l>=1; l--){
                    System.out.print(l);
                }
                System.out.println();
            }
        }
        System.out.println();
        for(int i=9; i>=1; i--){
            for(int j=1; j<=10-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print(k);
            }
            for(int l=i-1; l>=1; l--){
                System.out.print(l);
            }
            System.out.println();


        }


    }
}
