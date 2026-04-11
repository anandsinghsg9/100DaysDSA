package Day_29.Anushka;

import java.util.HashSet;

public class OptimalSolutionPairsWithDifferenceK {

    public static int countPairs(int[] arr, int k) {
        HashSet<Integer> set = new HashSet<>();

        // Step 1: store all elements
        for (int num : arr) {
            set.add(num);
        }

        int count = 0;

        // Step 2: check pairs
        for (int num : arr) {
            if (set.contains(num + k)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4, 2};
        int k = 2;

        System.out.println("Pairs count: " + countPairs(arr, k));
    }
}