package Day_9.Anushka;
public class containerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int result = maximumArea(height);
        System.out.println(result); // 49
    }
    public static int maximumArea(int[] height) {
        int maximumWaterContained = 0;
        for (int left = 0; left < height.length; left++) {
            for (int right = left + 1; right < height.length; right++) {
                int width = right - left;
                int ht = Math.min(height[left], height[right]);
                int area = width * ht;
                maximumWaterContained = Math.max(maximumWaterContained, area);
            }
        }
        return maximumWaterContained;
    }
}