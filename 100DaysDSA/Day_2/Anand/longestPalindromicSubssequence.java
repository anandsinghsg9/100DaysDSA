public class longestPalindromicSubssequence{
    public int longestPalindromeSubseq(String s) {
        StringBuilder r = new StringBuilder(s);
        r.reverse();
        String rev = r.toString();
        
        char[] Str1 = s.toCharArray();
        char[] Str2 = rev.toCharArray();
        int n = Str1.length;
        int[][] dp = new int[n + 1][n + 1];

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else {
                    // Fix: Str2 should be indexed by j-1
                    if (Str1[i - 1] == Str2[j - 1]) {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    } else {
                        dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                    }
                }
            }
        }
        return dp[n][n];
    }

    public static void main(String[] args) {
        longestPalindromicSubssequence sol = new longestPalindromicSubssequence();
        
        // Test Case 1: "bbab" -> Longest is "bbbb", length 4
        String input1 = "bbab";
        System.out.println("Input: " + input1);
        System.out.println("Output: " + sol.longestPalindromeSubseq(input1));
    }
}