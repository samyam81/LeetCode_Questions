using System;
using System.Collections.Generic;

public class Word_Pattern {
    public bool WordPattern(string pattern, string s) {
        string[] words = s.Split(' ');
        
        if (pattern.Length != words.Length)
            return false;
        
        Dictionary<char, string> charToString = new Dictionary<char, string>();
        Dictionary<string, char> stringToChar = new Dictionary<string, char>();
        
        for (int i = 0; i < pattern.Length; i++) {
            if (!charToString.ContainsKey(pattern[i])) {
                if (stringToChar.ContainsKey(words[i]))
                    return false;
                
                charToString[pattern[i]] = words[i];
                stringToChar[words[i]] = pattern[i];
            } else if (charToString[pattern[i]] != words[i])
                return false;
        }
        
        return true;
    }
}
