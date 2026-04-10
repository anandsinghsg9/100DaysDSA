package Day_27.Anushka;

public class minimumDistanceBetweenThreeEqualElements {

    public static int minimumDistance(int[] nums) {
        int n = nums.length;
        int minDist = Integer.MAX_VALUE;

        // check all triples
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {

                    if (nums[i] == nums[j] && nums[j] == nums[k]) {

                        int dist = Math.abs(i - j)
                                 + Math.abs(j - k)
                                 + Math.abs(k - i);

                        minDist = Math.min(minDist, dist);
                    }
                }
            }
        }

        return minDist == Integer.MAX_VALUE ? -1 : minDist;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 1, 3};

        System.out.println(minimumDistance(nums));
    }
}