public class binarySearchRecursive {
    public int search(int[] arr, int target) {
        return bs(0, arr.length - 1, target, arr);
    }
    private int bs(int low, int high, int target, int[] arr) {
        if (low > high) {
            return -1;
        }
        int mid = low + (high - low) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (target < arr[mid]) {
            return bs(low, mid - 1, target, arr);
        } else {
            return bs(mid + 1, high, target, arr);
        }
    }
      public static void main(String[] args) {
        binarySearchRecursive obj = new binarySearchRecursive();
        int[] arr = {1, 3, 5, 7, 9, 11};
        int target = 7;
        int result = obj.search(arr, target);
        System.out.println("Index: " + result);
    }
}
