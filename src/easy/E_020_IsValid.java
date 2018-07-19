package easy;

import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 */
public class E_020_IsValid {

    /**
     * 栈实现
     */
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (!isCharValid(c)) {
                return false;
            }
            if (stack.isEmpty() || !isPair(stack.peek(), c)) {
                stack.push(c);
            } else {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    /**
     * 是否是一对字符
     */
    private boolean isPair(char c1, char c2) {
        return (c1 == '(' && c2 == ')')
                || (c1 == '{' && c2 == '}')
                || (c1 == '[' && c2 == ']');
    }

    /**
     * 字符是否有效
     */
    private boolean isCharValid(char c) {
        return c == '('
                || c == ')'
                || c == '['
                || c == ']'
                || c == '{'
                || c == '}';
    }
}
