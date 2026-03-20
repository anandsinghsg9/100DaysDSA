package Day_7.Sahil;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        int n = s.length();

        if (n % 2 == 1) {
            return false;
        }

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            } else {
                if (st.isEmpty()) return false;

                char top = st.peek();

                if (ch == ')' && top == '(') st.pop();
                else if (ch == ']' && top == '[') st.pop();
                else if (ch == '}' && top == '{') st.pop();
                else return false;
            }
        }

        return st.isEmpty();
    }

    public static void main(String[] args) {
        String s1 = "()[]{}";
        String s2 = "(]";
        String s3 = "([{}])";

        System.out.println(s1 + " -> " + isValid(s1));
        System.out.println(s2 + " -> " + isValid(s2));
        System.out.println(s3 + " -> " + isValid(s3));
    }
    
}
