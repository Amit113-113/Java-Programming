import java.util.*;
public class practice2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        if(a>=30 && a<=50){
            System.out.println("Average");
        }
        else if(a>=51 && a<=60){
            System.out.println("Good");
        }
        else if(a>=61 && a<=80){
            System.out.println("Excellent");
        }
        else{
            System.out.println("Outstanding");
        }
    }
}
