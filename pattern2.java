public class pattern2 {
    public static void main(String[] args) {
        // Approach 1
//        int a=1;
//        for(int i=10; i>=1; i--){
//            for(int j=1; j<i; j++){
//                System.out.print(" ");
//            }
//            for(int k=1; k<=a; k++){
//                System.out.print(k);
//            }
//            a++;
//            System.out.println();
//        }
          // approach 2
        for(int i=1; i<=10; i++){
            for(int j=1; j<=10-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
