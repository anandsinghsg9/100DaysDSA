package Day_39.Anushka;

public class searchInDescreasingOrderArray {

    public static int searchTarget(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                low = mid + 1;   // move right
            } else {
                high = mid - 1;  // move left
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {110, 94, 87, 61, 60, 57, 56, 41, 22, 9};
        int target = 41;

        int result = searchTarget(arr, target);

        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found");
        }
    }
}
