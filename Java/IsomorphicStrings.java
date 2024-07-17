package Java;

import java.util.HashMap;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;
        HashMap<Character, Character> s1 = new HashMap<>();
        HashMap<Character, Character> t1 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char d = t.charAt(i);
            if ((s1.containsKey(c) && s1.get(c) != d) ||
                    (t1.containsKey(d) && t1.get(d) != c)) {
                return false;
            }

            s1.put(c, d);
            t1.put(d, c);
        }
        return true;
    }
}
