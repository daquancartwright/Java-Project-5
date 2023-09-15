import java.util.Stack;
import java.util.HashMap;
import java.util.Map;

public class BalancedBrackets {
    public static boolean hasBalancedBrackets(String input) {
        Stack<Character> stack = new Stack<>();

        // Define a map to store the bracket pairs
        Map<Character, Character> bracketPairs = new HashMap<>();
        bracketPairs.put('(', ')');
        bracketPairs.put('{', '}');
        bracketPairs.put('[', ']');
        bracketPairs.put('<', '>');

        for (char ch : input.toCharArray()) {
            if (bracketPairs.containsKey(ch)) {
                // Push opening bracket onto the stack
                stack.push(ch);
            } else if (bracketPairs.containsValue(ch)) {
                // Check if there's a matching opening bracket on the stack
                if (stack.isEmpty() || bracketPairs.get(stack.pop()) != ch) {
                    return false; // Unmatched closing bracket
                }
            }
        }

        // If the stack is empty, all brackets are balanced
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String testString1 = "(a + b) - {c + d}";
        String testString2 = "[(x + y) * z]";
        String testString3 = "<(a + b)>";
        String testString4 = "({[}])";

        System.out.println(hasBalancedBrackets(testString1)); // true
        System.out.println(hasBalancedBrackets(testString2)); // true
        System.out.println(hasBalancedBrackets(testString3)); // true
        System.out.println(hasBalancedBrackets(testString4)); // false
    }
}

