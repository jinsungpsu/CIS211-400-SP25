import java.util.Stack;

public class ExpTester {
    public static void main(String[] args) {
        String exp1 = "[()]{}{[()()]()}";
        String exp2 = "[(])";
        if (checkExpression(exp1)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
        if (checkExpression(exp2)) {
            System.out.println("valid!");
        } else {
            System.out.println("Invalid");
        }
    }

    static boolean checkExpression(String exp) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            if (exp.charAt(i) == '{' || exp.charAt(i) == '(' || exp.charAt(i) == '['){
                stack.push(exp.charAt(i));
            } else {
                if (exp.charAt(i) == '}') {
                    if (stack.pop() != '{') return false;
                }
                // do the same for [ and (
            }
        }
        return true;
    }
}
