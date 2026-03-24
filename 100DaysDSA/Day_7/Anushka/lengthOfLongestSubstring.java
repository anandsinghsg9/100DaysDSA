package Day_7;

public class lengthOfLongestSubstring {

    public static void main(String[] args) {
        String s = "abcabcbb";

        int result = longestSubstring(s);
        System.out.println("Longest substring length: " + result);
    }

    public static int longestSubstring(String s) {
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            String temp = "";

            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);

                if (temp.indexOf(ch) != -1) {
                    break;
                }

                temp += ch;
                max = Math.max(max, temp.length());
            }
        }

        return max;
    }
}