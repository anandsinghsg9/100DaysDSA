package Day_46.Anushka;

public class maximumJumps {

    public static int solve(int i, int[] nums, int target) {

        // reached last index
        if(i == nums.length - 1) {
            return 0;
        }

        int max = -1;

        // check all next indices
        for(int j = i + 1; j < nums.length; j++) {

            // jump possible
            if(Math.abs(nums[j] - nums[i]) <= target) {

                int ans = solve(j, nums, target);

                // valid path exists
                if(ans != -1) {

                    max = Math.max(max, ans + 1);
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[] nums = {1,3,6,4,1,2};
        int target = 2;

        int result = solve(0, nums, target);

        System.out.println(result);
    }
}