package Java;

public class LastWord {
    public static void main(String[] args) {
        String s="Hello World";
        int length=lengthLastWord(s);
        System.out.println(length);
    }

    private static int lengthLastWord(String s) {
        String[] str = s.split(" ");
        return str[str.length-1].length();
    }
}
