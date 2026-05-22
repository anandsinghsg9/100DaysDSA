package Anushka;

import java.util.HashMap;

public class findSpecialInteger {

    public static int findSpecialIntegerMethod(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int n = arr.length;

        for (int i = 0; i < n; i++) {

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

            if (map.get(arr[i]) > n / 4) {
                return arr[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 6, 6, 6, 6, 7, 10};

        int ans = findSpecialIntegerMethod(arr);

        System.out.println(ans);
    }
}