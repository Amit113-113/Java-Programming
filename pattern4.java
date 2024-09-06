public class pattern4 {
    public static void main(String[] args) {
        for(int i=2; i<=10; i++){
            for(int j=1;j<=10-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print(k);
            }
            char dem= (char)('A' + (i-2));
            for(int l=1; l<i; l++){
                System.out.print(dem);
                dem--;
            }
            System.out.println();
        }
    }
}
