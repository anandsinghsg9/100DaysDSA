package Day_42.Sahil;

public class Main {

    public static boolean isAnagram(String s, String t) {
        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int idx = ch - 'a';
            arr[idx]++;
        }

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            int idx = ch - 'a';
            arr[idx]--;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        boolean result = isAnagram(s, t);

        System.out.println(result);
    }
}
