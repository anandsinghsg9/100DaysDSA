public class kthPositiveMissingNumber {

    public static int findKthPositive(int[] arr, int k) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int correctedMid = mid + 1;

            int missingNoFrom0toMid = arr[mid] - correctedMid;

            if (missingNoFrom0toMid < k) {

                low = mid + 1;

            } else {

                high = mid - 1;
            }
        }

        return high + 1 + k;
    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 7, 11};

        int k = 5;

        int ans = findKthPositive(arr, k);

        System.out.println(ans);
    }
}