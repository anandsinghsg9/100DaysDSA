package Sahil;

import java.util.*;

public class Solution {

    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        int[] arr = new int[26];

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            int idx = c - 'a';
            arr[idx]++;
        }

        for(int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);
            int idx = ch - 'a';
            arr[idx]--;
        }

        for(int i = 0; i < 26; i++){
            if(arr[i] != 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        String s = "listen";
        String t = "silent";

        boolean result = sol.isAnagram(s, t);

        System.out.println("Are anagrams? " + result);
    }
}