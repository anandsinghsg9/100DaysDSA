package Day_27.Sahil;

import java.util.*;

public class Main {

    public static int[] rearrangeArray(int[] arr) {
        int n = arr.length;
        int positiveNum = 0;
        int negativeNum = 1;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                ans[positiveNum] = arr[i];
                positiveNum += 2;
            } else {
                ans[negativeNum] = arr[i];
                negativeNum += 2;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, -2, -5, 2, -4};

        int[] result = rearrangeArray(arr);

        System.out.println(Arrays.toString(result));
    }
}
