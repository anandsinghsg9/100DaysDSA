package Day_29.Sahil;

import java.util.*;

public class Main {

    public static List<Integer> majorityElement(int[] arr) {
        int n = arr.length;
        List<Integer> ans = new ArrayList<>(n / 3);

        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > n / 3 && !ans.contains(arr[i])) {
                ans.add(arr[i]);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 3};

        List<Integer> result = majorityElement(arr);

        System.out.println(result);
    }
}