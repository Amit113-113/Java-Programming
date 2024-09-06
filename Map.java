import java.util.*;
public class Map {
    public static void main(String[] args) {
        String a="SPIDERS_WEB_OF_LIES";
        char[] b=a.toCharArray();
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        int i=0;
        while(i!=b.length){
            if(map.containsKey(b[i])==false){
                map.put(b[i],1);
            }
            else{
                int ov=map.get(b[i]);
                int nv=ov+1;
                map.put(b[i],nv);
            }
            ++i;
        }
        Set<HashMap.Entry<Character, Integer>> hmap= map.entrySet();
        for(HashMap.Entry<Character, Integer> data: hmap){
            System.out.print(data.getKey() + " ");
            System.out.println(data.getValue());
        }
    }
}
