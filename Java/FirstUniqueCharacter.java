package Java;
import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        Map<Character,Integer> charcounter=new HashMap<>();

        for (char c : s.toCharArray())
            charcounter.put(c, charcounter.getOrDefault(c,0)+1);           
        
        for (int i = 0; i < s.length(); i++) 
            if (charcounter.get(s.charAt(i))==1) 
                return i;
            
        return -1;
    }
}
