import java.util.Arrays;

public class sortColoursOptimalApproach {

    public static void sortColours(int[] nums) {

        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {

            if (nums[mid] == 0) {

                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;
            }

            else if (nums[mid] == 1) {

                mid++;
            }

            else {

                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
            }
        }
    }   // <-- sortColours ends here

    public static void main(String[] args) {

        int[] nums = {1, 2, 0, 2, 0, 1, 0, 2};

        sortColours(nums);

        System.out.println(Arrays.toString(nums));
    }
}