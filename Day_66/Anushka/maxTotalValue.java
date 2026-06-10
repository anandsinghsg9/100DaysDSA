public class maxTotalValue {

    public long maxTotalValue(int[] nums, int k) {

        long max = nums[0];
        long min = nums[0];

        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        return (max - min) * (long) k;
    }

    public static void main(String[] args) {

        maxTotalValue obj = new maxTotalValue();

        int[] nums = {1, 3, 2};
        int k = 2;

        System.out.println(obj.maxTotalValue(nums, k));
    }
}