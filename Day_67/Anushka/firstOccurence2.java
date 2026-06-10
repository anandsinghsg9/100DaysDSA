public class firstOccurence2 {
    public int firstSearch(int[] arr, int k) {
        return bs(arr, 0, arr.length - 1, k);
    }
    private int bs(int[] arr, int low, int high, int k) {
        if (low > high) {
            return -1;
        }
        int mid = low + (high - low) / 2;
        if (arr[mid] == k) {
            int leftResult = bs(arr, low, mid - 1, k);
            return (leftResult != -1) ? leftResult : mid;
        }
        if (k < arr[mid]) {
            return bs(arr, low, mid - 1, k);
        } else {
            return bs(arr, mid + 1, high, k);
        }
    }
    public static void main(String[] args) {
        firstOccurence2 obj = new firstOccurence2();
        int[] arr = {1, 2, 2, 2, 3, 4};
        int k = 2;
        int result = obj.firstSearch(arr, k);
        System.out.println("First Occurrence Index: " + result);
    }
}