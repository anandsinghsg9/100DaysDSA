public class lastOccurence {
    public int lastSearch(int[] arr, int k) {
        return bs(arr, 0, arr.length - 1, k);
    }
    private int bs(int[] arr, int low, int high, int k) {
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == k) {
                result = mid;      // store answer
                low = mid + 1;     // move right
            }
            else if (k < arr[mid]) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        return result;
    }

    // MAIN METHOD
    public static void main(String[] args) {
        lastOccurence obj = new lastOccurence();

        int[] arr = {1, 2, 2, 2, 3, 4};
        int k = 2;

        System.out.println(obj.lastSearch(arr, k));
    }
}