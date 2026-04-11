package Day_29.Anushka;

public class pairsWithDifferenceK {

    public static int countPairs(int[] arr, int k) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (Math.abs(arr[i] - arr[j]) == k) {
                    count++;
                }
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