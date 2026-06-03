import java.util.Arrays;

public class merge2SortedArrayWithExtraSpace {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        merge2sortedArrays(nums1, nums2, m, n);

        // print result
        for (int x : nums1) {
            System.out.print(x + " ");
        }
    }

    public static void merge2sortedArrays(int[] nums1, int[] nums2, int m, int n) {
        int[] result = new int[m + n];
        int indexPointer = 0;

        for (int i = 0; i < m; i++) {
            result[indexPointer] = nums1[i];
            indexPointer++;
        }

        for (int i = 0; i < n; i++) {
            result[indexPointer] = nums2[i];
            indexPointer++;
        }

        Arrays.sort(result);
        for (int i = 0; i < m + n; i++) {
            nums1[i] = result[i];
        }
    }
}