public class ReverseVowel {
    public static void main(String[] args) {
        String str = "hello world";
        System.out.println("The original String::" + str);
        str = reVowel(str);
        System.out.println("The String::" + str);
    }

    static String reVowel(String str) {
        char[] charArray = str.toCharArray();
        char[] vowels = new char[charArray.length];
        int i = 0;

        for (char c : charArray) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels[i] = c;
                i++;
            }
        }

        for (int j = 0; j < i / 2; j++) {
            char temp = vowels[j];
            vowels[j] = vowels[i - j - 1];
            vowels[i - j - 1] = temp;
        }

        int vowelIndex = 0;
        StringBuilder result = new StringBuilder();
        for (char c : charArray) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                result.append(vowels[vowelIndex]);
                vowelIndex++;
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}
