package Day_7.Sahil;

import java.util.Stack;

public class BaseballGame {
    public static int calPoints(String[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            String s = arr[i];

            if (s.equals("C")) {
                st.pop();
            } 
            else if (s.equals("D")) {
                st.push(2 * st.peek());
            } 
            else if (s.equals("+")) {
                int top = st.pop();
                int secondTop = st.peek();
                int sum = top + secondTop;
                st.push(top);
                st.push(sum);
            } 
            else {
                st.push(Integer.parseInt(s));
            }
        }

        int sum = 0;
        while (!st.isEmpty()) {
            sum += st.pop();
        }

        return sum;
    }

    public static void main(String[] args) {
        String[] arr = {"5", "2", "C", "D", "+"};

        int result = calPoints(arr);
        System.out.println("Final Score: " + result);
    }
}
