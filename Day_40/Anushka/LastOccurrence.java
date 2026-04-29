package Day_40.Anushka;

public class LastOccurrence {

    public static int lastOccurrence(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                ans = mid;
                low = mid + 1;   // move right
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 4, 4, 7, 9};
        int target = 4;

        int result = lastOccurrence(nums, target);
        System.out.println(result);
    }
}