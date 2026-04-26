package Day_38.Sahil;


public class Main {

    public static int findMin(int[] nums) {
        int n = nums.length;
        int st = 0;
        int end = n - 1;

        while (st < end) {
            int mid = st + (end - st) / 2;

            if (nums[mid] > nums[end]) {
                st = mid + 1;
            } else {
                end = mid;
            }
        }

        return nums[st];
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2};

        int result = findMin(nums);

        System.out.println(result);
    }
}
