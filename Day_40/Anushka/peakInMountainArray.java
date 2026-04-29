package Day_40.Anushka;

public class peakInMountainArray {

    public static int peakIndex(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = (low + high) / 2;

            if (arr[mid] < arr[mid + 1]) {
                low = mid + 1;   // move right
            } else {
                high = mid;      // move left
            }
        }

        return low;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 6, 4, 2};

        System.out.println(peakIndex(arr));
    }
}