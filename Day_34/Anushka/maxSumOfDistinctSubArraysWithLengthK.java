package Day_34.Anushka;

import java.util.HashMap;

public class maxSumOfDistinctSubArraysWithLengthK {

    public static long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        long sum = 0, max = 0;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {

            // add element
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
            sum += nums[right];

            // shrink window if size > k
            if (right - left + 1 > k) {
                map.put(nums[left], map.get(nums[left]) - 1);
                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                }
                sum -= nums[left];
                left++;
            }

            // check valid window
            if (right - left + 1 == k && map.size() == k) {
                max = Math.max(max, sum);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] nums = {1, 5, 4, 2, 9, 9, 9};
        int k = 3;

        System.out.println(maximumSubarraySum(nums, k)); // Output: 15
    }
}
