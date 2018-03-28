import java.util.Stack;

/**
 * Created by agaped on 12.03.2018.
 */
public class ValidParentheses {

    public static boolean isValid (String s) {
        if (s == null || s == "") {
            return false;
        }
            Stack<Character> stack = new Stack<Character>();
            for (char c : s.toCharArray()) {
                if (c == '(') {
                    stack.push(')');
                } else if (c == '{') {
                    stack.push('}');
                } else if (c == '[') {
                    stack.push(']');
                } else if (Character.toString(c).matches("[^](){}\\[]")) {
                    continue;
                } else if (stack.isEmpty() || stack.pop() != c) {
                    return false;
                }
            }
            return stack.isEmpty();
    }
}
