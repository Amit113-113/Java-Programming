import java.util.*;
public class backspaceCharacter {

    public static int getChar(String str, int end){
        int num=0;
        while(end>=0){
            if(str.charAt(end)!='#'){
                if(num==0){
                    return end;
                }
                else{
                    num--;
                }
            }
            else{
                num++;
            }
            end--;
        }
        return end;
    }

    public static boolean check(String str1, String str2){
        int end1=str1.length()-1;
        int end2=str2.length()-1;
        while(end1>=0 && end2>=0){
            int a=getChar(str1,end1);
            int b=getChar(str2,end2);
            if(a<0 && b<0){
                return true;
            }
            if(a>=0 && b<0){
                return false;
            }
            if(a<0 && b>=0){
                return false;
            }
            if(str1.charAt(a) != str2.charAt(b)){
                return false;
            }
            end1=a-1;
            end2=b-1;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        if(check(str1, str2)){
            System.out.println("Same string!!");
        }
        else{
            System.out.println("Different string!!");
        }

    }
}
