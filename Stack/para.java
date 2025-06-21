import java.util.Stack;
public class para {
    //Parenthesis Checker using Stack
    public static void main(String[] args) {
        String str = "((()))";
        Stack<Character> stack = new Stack<>();
        boolean isValid = true;

        for (char ch : str.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    isValid = false;
                    break;
                }
            }
        }

        if (!stack.isEmpty()) {
            isValid = false;
        }

        System.out.println("The parenthesis are " + (isValid ? "balanced" : "not balanced"));
    }

}
