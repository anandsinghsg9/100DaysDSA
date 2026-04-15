package Day_33.Anushka;
public class closestTargetCircularArray {

    public static int closestTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        int minDist = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (words[i].equals(target)) {

                int right = (i - startIndex + n) % n;
                int left = (startIndex - i + n) % n;

                int curr = Math.min(right, left);
                minDist = Math.min(minDist, curr);
            }
        }

        return minDist == Integer.MAX_VALUE ? -1 : minDist;
    }

    public static void main(String[] args) {
        String[] words = {"hello","i","am","leetcode","hello"};
        String target = "hello";
        int startIndex = 1;

        System.out.println(closestTarget(words, target, startIndex)); // Output: 1
    }
}