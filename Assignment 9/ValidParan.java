import java.util.Stack;

public class ValidParan {
    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                stack.push(ch);
            } 
            else if (ch == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = "(()())";
        
        if (isBalanced(str)) {
            System.out.println("BALANCED");
        } else {
            System.out.println("NOT BALANCED");
        }
    }
}