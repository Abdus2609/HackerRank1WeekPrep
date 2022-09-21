import java.util.Stack;

public class P15BalancedBrackets {
    
    public static String isBalanced(String s) {

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (c == ')' && !stack.isEmpty()) {
                    if (stack.pop() != '(') {
                        return "NO";
                    } else {
                        continue;
                    }
                } else if (c == ']' && !stack.isEmpty()) {
                    if (stack.pop() != '[') {
                        return "NO";
                    } else {
                        continue;
                    }
                } else if (c == '}' && !stack.isEmpty()) {
                    if (stack.pop() != '{') {
                        return "NO";
                    } else {
                        continue;
                    }
                } else {
                    return "NO";
                }
            }
        }

        if (!stack.isEmpty()) {
            return "NO";
        }

        return "YES";

    }
}
