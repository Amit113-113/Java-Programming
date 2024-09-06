import java.util.*;
public class vowelsConsonent {
    public static void main(String[] args) {
        String str= "Anirban umbrella";
        int vowel=0;
        int consonent=0;
        int special=0;
        for(int i=0; i<str.length();i++){
            if((str.charAt(i)>='A' && str.charAt(i) <= 'Z') || (str.charAt(i)>='a' && str.charAt(i) <= 'z')){
                if(str.charAt(i)=='A' || str.charAt(i)=='E' ||str.charAt(i)=='I' ||str.charAt(i)=='O' ||str.charAt(i)=='U' ||str.charAt(i)=='a' ||str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' || str.charAt(i)=='u'){
                    vowel++;
                }
                else{
                    consonent++;
                }
            }

            else{
                special++;
            }

        }

        System.out.println("Vowel: "+ vowel);
        System.out.println("Consonent: "+ consonent);
        System.out.println("Special: "+ special);
    }
}
