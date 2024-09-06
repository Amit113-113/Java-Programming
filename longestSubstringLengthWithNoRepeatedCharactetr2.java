import java.util.*;
public class longestSubstringLengthWithNoRepeatedCharactetr2 {
    public static void main(String[] args) {
        String str="babccbacd";
        int maxLength=0;
        int start=0, end=0;

        HashMap<Character,Integer> map= new HashMap<>();

        while(end<str.length()){
            char currentChar=str.charAt(end);

            if(map.containsKey(currentChar)){
                start=Math.max(start, map.get(currentChar)+1);
            }
            map.put(currentChar, end);
            maxLength= Math.max(end-start+1, maxLength);
            end++;
        }
        System.out.println(start);
        System.out.println(end);

        System.out.println(maxLength);
    }
}