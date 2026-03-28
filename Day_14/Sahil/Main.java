package Day_14.Sahil;

public class Main {
     public static String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        int min_len = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            min_len = Math.min(min_len, strs[i].length());
        }

        int count = 0;

        for (int i = 0; i < min_len; i++) {
            boolean flag = true;

            for (int j = 0; j < n; j++) {
                if (strs[j].charAt(i) != strs[0].charAt(i)) {
                    flag = false;
                    break;
                }
            }

            if (flag == true) count++;
            else break;
        }

        return strs[0].substring(0, count);
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};

        String result = longestCommonPrefix(strs);

        System.out.println("Longest Common Prefix: " + result);
    }
}
