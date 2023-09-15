import java.util.Stack;

public class BalancedParentheses {
    public static boolean hasBalancedParentheses(String input) {
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            if (ch == '(') {
                // Push opening parenthesis onto the stack
                stack.push(ch);
            } else if (ch == ')') {
                // Check if there's a matching opening parenthesis on the stack
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false; // Unmatched closing parenthesis
                }
            }
        }

        // If the stack is empty, all parentheses are balanced
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String testString1 = "(a + b) - (c + d)";
        String testString2 = "((x + y) * z)";
        String testString3 = ")(a + b)(";

        System.out.println(hasBalancedParentheses(testString1)); // true
        System.out.println(hasBalancedParentheses(testString2)); // true
        System.out.println(hasBalancedParentheses(testString3)); // false
    }
}

