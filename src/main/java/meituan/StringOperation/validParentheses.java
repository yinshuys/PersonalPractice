package meituan.StringOperation;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class validParentheses {
    private static final Map<Character, Character> map = new HashMap<Character, Character>() {{
        put('[', ']');
        put('{', '}');
        put('(', ')');
        put('?', '?');
    }};

    public boolean isValid(String s) {
        if (s.length() > 0 && !map.containsKey(s.charAt(0))) return false;
        LinkedList<Character> stack = new LinkedList<Character>() {{
            add('?');
        }};
        for (Character c : s.toCharArray()) {
            if (map.containsKey(c)) stack.add(c);
            else if (map.get(stack.removeLast()) != c) return false;
        }
        return stack.size() == 1;
    }

    public boolean isValid1(String s) {
        Deque<Character> stack = new LinkedList<>();
        for (Character c : s.toCharArray()) {
            if (c == '[' || c == '{' || c == '(') stack.push(c);
            else {
                if (stack.isEmpty()) return false;
                else if (c == ']' && stack.pop() != '[') return false;
                else if (c == '}' && stack.pop() != '{') return false;
                else if (c == ')' && stack.pop() != '(') return false;
            }

        }
        return stack.isEmpty();
    }
}
