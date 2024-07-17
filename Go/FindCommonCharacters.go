package main

func commonChars(words []string) []string {
    if len(words) == 0 {
        return []string{}
    }
    

    charCount := make(map[rune]int)
    for _, char := range words[0] {
        charCount[char]++
    }
    
    for _, word := range words[1:] {
        wordCharCount := make(map[rune]int)
        
        for _, char := range word {
            wordCharCount[char]++
        }

        for char, count := range charCount {
            if wordCount, ok := wordCharCount[char]; ok {
                charCount[char] = min(count, wordCount)
            } else {
                delete(charCount, char)
            }
        }
    }

    var result []string
    for char, count := range charCount {
        for i := 0; i < count; i++ {
            result = append(result, string(char))
        }
    }
    
    return result
}

func min(a, b int) int {
    if a < b {
        return a
    }
    return b
}
