package Day_40.Sahil;

import java.util.*;

public class Main {

    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            st.push(nums[i]);
        }

        int[] ans = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            while (st.size() > 0 && st.peek() <= nums[i]) st.pop();

            if (st.size() == 0) ans[i] = -1;
            else ans[i] = st.peek();

            st.push(nums[i]);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1};

        int[] result = nextGreaterElements(nums);

        System.out.println(Arrays.toString(result));
    }
}
