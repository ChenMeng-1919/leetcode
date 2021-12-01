package stack;

import java.util.*;

/**
 * @author: cm
 * @since: Created in 2021/11/30 16:14
 * @description:
 */
public class Solution20 {
    /**
     * @description: 官方题解
     * @Param: [s]
     * @Return: boolean
     * @Date: 2021/11/30 18:23
     */
    public boolean isValid(String s) {
        int n = s.length();
        if (n % 2 == 1) {
            return false;
        }

        Map<Character, Character> pairs = new HashMap<Character, Character>() {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};
        Deque<Character> stack = new LinkedList<Character>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (pairs.containsKey(ch)) {
                if (stack.isEmpty() || !stack.peek().equals(pairs.get(ch))) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }

    public boolean isValid2(String s) {
        int n = s.length();
        if (n % 2 == 1) {
            return false;
        }
        Stack<Character> eleStack = new Stack<>();
        HashMap<Character, Character> eleHashMap = new HashMap<>();
        eleHashMap.put(')', '(');
        eleHashMap.put('}', '{');
        eleHashMap.put(']', '[');
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (eleHashMap.containsKey(c)) {
                if (eleStack.isEmpty() || !eleStack.peek().equals(eleHashMap.get(c))) {
                    return false;
                }
                eleStack.pop();
            } else {
                eleStack.push(c);
            }
        }
        return eleStack.isEmpty();
    }
}
