import java.util.*;

public class encodeThreeStrings {
    public static void main(String[] args) {
        String a="John";
        String b="Johny";
        String c="Janardhan";
        String[] arr={a,b,c};

        String p="";
        String q="";
        String r="";


        for(int j=0; j<arr.length; j++){
            if(arr[j].length()%3==1){
                p= p+ arr[j].charAt(0);
                q= q+ arr[j].charAt(1)+ arr[j].charAt(2);
                r= r+ arr[j].charAt(3);
            }
            if(arr[j].length()%3==2){
                p= p+ arr[j].charAt(0)+arr[j].charAt(1);
                q= q+ arr[j].charAt(2);
                r= r+ arr[j].charAt(3)+ arr[j].charAt(4);
            }
            if(arr[j].length()%3==0){
                p= p+ arr[j].charAt(0)+ arr[j].charAt(1)+ arr[j].charAt(2);
                q= q+ arr[j].charAt(3)+ arr[j].charAt(4)+ arr[j].charAt(5);
                r= r+ arr[j].charAt(6)+ arr[j].charAt(7)+ arr[j].charAt(8);
            }

        }
        StringBuilder s1= new StringBuilder();
        for(char ch: r.toCharArray()){
            if(Character.isUpperCase(ch)){
                s1.append(Character.toLowerCase(ch));
            }
            else{
                s1.append(Character.toUpperCase(ch));
            }
        }
        String s2=s1.toString();

        System.out.println(p);
        System.out.println(q);
        System.out.println(s2);
    }
}
