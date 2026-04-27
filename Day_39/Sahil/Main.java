package Day_39.Sahil;

import java.util.*;

public class Main {

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        Stack<Integer> st = new Stack<>();
        int[] nge = new int[m];

        for (int i = m - 1; i >= 0; i--) {
            while (st.size() > 0 && nums2[i] >= st.peek()) st.pop();

            if (st.size() == 0) nge[i] = -1;
            else nge[i] = st.peek();

            st.push(nums2[i]);
        }

        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (nums1[i] == nums2[j]) {
                    ans[i] = nge[j];
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};

        int[] result = nextGreaterElement(nums1, nums2);

        System.out.println(Arrays.toString(result));
    }
}