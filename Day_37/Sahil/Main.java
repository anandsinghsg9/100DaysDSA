package Day_37.Sahil;

import java.util.*;

public class Main {

    public static int findPeakElement(int[] arr) {
        int n = arr.length;
        int st = 0;
        int end = n - 1;

        while (st < end) {
            int mid = st + (end - st) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                st = mid + 1;
            }
        }

        return st;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 5, 6, 4};

        int result = findPeakElement(arr);

        System.out.println(result);
    }
}