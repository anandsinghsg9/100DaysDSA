package Anand;

import java.util.Arrays;

public class assignCookies {
    public static void main(String[] args) {
        // Example test cases
        int[] greedFactors = {1, 2, 3};
        int[] cookieSizes = {1, 1};

        assignCookies sol = new assignCookies();
        int result = sol.findContentChildren(greedFactors, cookieSizes);

        System.out.println("Number of content children: " + result);
    }
    public int findContentChildren(int[] g, int[] s) {
        // 1. Sort both the greed factors and the cookie sizes
        Arrays.sort(g);
        Arrays.sort(s);
        
        int childIndex = 0;
        int cookieIndex = 0;
        
        // 2. Iterate through cookies to find matches
        while (childIndex < g.length && cookieIndex < s.length) {
            // If the current cookie can satisfy the current child
            if (s[cookieIndex] >= g[childIndex]) {
                childIndex++; // Move to the next child
            }
            // Move to the next cookie regardless (if it was too small or used)
            cookieIndex++;
        }
        
        return childIndex;
    }
    
}
