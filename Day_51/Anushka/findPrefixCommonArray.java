package Day-51.Anushka;

import java.util.Arrays;

public class findPrefixCommonArray {  public static int[] findThePrefixCommonArray(int[] A, int[] B) {

        int n = A.length;

        int[] result = new int[n];

        int[] freq = new int[n + 1];

        int common = 0;

        for (int i = 0; i < n; i++) {

            freq[A[i]]++;

            if (freq[A[i]] == 2) {
                common++;
            }

            freq[B[i]]++;

            if (freq[B[i]] == 2) {
                common++;
            }

            result[i] = common;
        }

        return result;
    }

    public static void main(String[] args) {

        int[] A = {1, 3, 2, 4};
        int[] B = {3, 1, 2, 4};

        int[] ans = findThePrefixCommonArray(A, B);

        System.out.println(Arrays.toString(ans));
    }
}