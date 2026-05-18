public class Solution {

    public boolean canJump(int[] nums) {
        boolean[] reachable = new boolean[nums.length];
        reachable[0] = true;
        for(int i = 0; i < nums.length; i++) {
            if(reachable[i]) {
                for(int jump = 1; jump <= nums[i]; jump++) {
                    if(i + jump < nums.length) {
                        reachable[i + jump] = true;
                    }
                }
            }
        }

        return reachable[nums.length - 1];
    }

    public static void main(String[] args) {

        int[] nums = {2,3,1,1,4};

        Solution obj = new Solution();

        boolean ans = obj.canJump(nums);

        System.out.println(ans);
    }
}