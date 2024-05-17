import java.util.HashMap;
import java.util.HashSet;

public class Anagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> hello = new HashMap<>();
        HashMap<Character, Integer> hi = new HashMap<>();

        for (char c : s.toCharArray()) {
            hello.put(c, hello.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            hi.put(c, hi.getOrDefault(c, 0) + 1);
        }

        return hello.equals(hi)
    }
}
