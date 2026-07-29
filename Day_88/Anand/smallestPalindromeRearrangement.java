package Day_88.Anand;
import java.util.HashMap;

public class smallestPalindromeRearrangement {
    public String smallestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        StringBuilder ans = new StringBuilder();
        char mid = '\0';

        for (char i = 'a'; i <= 'z'; i++) {
            if (map.containsKey(i)) {
                if (map.get(i) % 2 == 1) {
                    mid = i;
                }

                ans.append(String.valueOf(i).repeat(map.get(i) / 2));
            }
        }

        int step = 0;
        if (mid != '\0') {
            ans.append(mid);
            step = 1;
        }

        for (int i = ans.length() - 1 - step; i >= 0; i--) {
            ans.append(ans.charAt(i));
        }

        return ans.toString();
    }
    public static void main(String[] args) {
        smallestPalindromeRearrangement obj = new smallestPalindromeRearrangement();
        String s = "aaabbbb";
        System.out.println(obj.smallestPalindrome(s));
    }
}
