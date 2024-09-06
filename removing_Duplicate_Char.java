import java.util.*;
import java.util.Map;

public class removing_Duplicate_Char {
    public static void main(String[] args) {
        String a="SILLYSPIDER";
        char[] b= a.toCharArray();
        LinkedHashMap<Character,Integer> map= new LinkedHashMap<>();
        int i=0;
        while(i!=b.length){
            if(!map.containsKey(b[i])){
                map.put(b[i],1);
            }
            ++i;
        }
        Set<Map.Entry<Character,Integer>> hmap= map.entrySet();
        for(Map.Entry<Character,Integer> data: hmap){
            System.out.print(data.getKey());
        }
    }
}
