import java.util.*;

public class identifyPossibleWords {
    public static void main(String[] args) {
        String input1="Fi_er";
        String input2="Fever:filer:Filter:Fixer:fibere:fibre:tailor:offer";
        input1=input1.toUpperCase();
        input2=input2.toUpperCase();
        String[] arr= input2.split(":");
        int a=input1.length();
        int z=0;
        StringBuilder str= new StringBuilder();
        for(int i=0; i<arr.length; i++){
            int s=0;
            if(arr[i].length()!=input1.length()){
                z++;
                continue;
            }
            for(int j=0; j<a; j++){
                if(input1.charAt(j)=='_'){
                    continue;
                }
                if(input1.charAt(j) != arr[i].charAt(j)){
                    z++;
                    s=1;
                    break;
                }
            }
            if(s==0){
                str.append(arr[i]+':');
            }
        }
        String str1=str.toString();
        String str3= str1.substring(0,str1.length()-1);
        if(z==arr.length){
            str3= "ERROR-009";
        }
        System.out.println(str3);

    }
}
