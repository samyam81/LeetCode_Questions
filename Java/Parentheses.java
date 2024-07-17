import java.util.Stack;

public class Parentheses {
    public static void main(String[] args) {
        String s="()[]{}";
        boolean output=check(s);
        System.out.println(output);
    }

    private static boolean check(String s) {
          Stack<Character> stack = new Stack<Character>();
            for (char c : s.toCharArray()){
                  if (c == '(')
                     stack.push(')'); 
                    else if (c == '{')
                      stack.push('}');
                    else if (c == '[')
                       stack.push(']');
                     else if (stack.isEmpty() || stack.pop() != c)
                        return false;  
            }
            return stack.isEmpty();
}
}
