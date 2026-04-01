package Anand;

import java.util.Arrays;

public class mergeSortedArrays {
    public static void main(String[] args) {
        // nums1 has a total size of m + n (3 + 3 = 6)
        int[] nums1 = {1, 2, 3, 0, 0, 0}; 
        int m = 3;
        
        int[] nums2 = {2, 5, 6};
        int n = 3;

        mergeSortedArrays sol = new mergeSortedArrays();
        sol.merge(nums1, m, nums2, n);

        // Print the result
        System.out.println("Merged Array: " + Arrays.toString(nums1));
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m + n];
        int first = 0;
        int second = 0;
        int i = 0;

        // Corrected loop logic: compare then increment
        while (first < m && second < n) {
            if (nums1[first] <= nums2[second]) {
                result[i] = nums1[first];
                first++;
            } else {
                result[i] = nums2[second];
                second++;
            }
            i++;
        }

        // Fill remaining elements from nums2
        while (second < n) {
            result[i++] = nums2[second++];
        }

        // Fill remaining elements from nums1
        while (first < m) {
            result[i++] = nums1[first++];
        }

        // Copy everything back to nums1
        for (int j = 0; j < (m + n); j++) {
            nums1[j] = result[j];
        }
    }
    
}
