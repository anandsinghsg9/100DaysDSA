package Day_5.Anushka;
import java.util.HashMap;
public class firstUniqueCharacterIndex {
    public static void main(String[] args) {
        String s = "loveleetcode";
        int result = firstUniqChar(s);
        System.out.println("First unique character index: " + result);
    }
    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        // Step 1: Count frequency
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        // Step 2: Find first unique
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}