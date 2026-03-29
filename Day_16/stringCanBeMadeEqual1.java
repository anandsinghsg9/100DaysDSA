package Day_16;

public class stringCanBeMadeEqual1 {
    public static void main(String[] args) {
        stringCanBeMadeEqual1 sol = new stringCanBeMadeEqual1();

        // Test Case 1: Swapping 'a' and 'c' at indices 0 and 2
        String s1 = "abcd";
        String s2 = "cbad";
        System.out.println("Test 1 Result: " + sol.canBeEqual(s1, s2)); // true

        // Test Case 2: Cannot be made equal
        String s3 = "abcd";
        String s4 = "dacb";
        System.out.println("Test 2 Result: " + sol.canBeEqual(s3, s4)); // false
    }
    public boolean canBeEqual(String s1, String s2) {
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();

        // Check even indices (0 and 2)
        // They can either be in the same position or swapped
        boolean evenMatch = (a1[0] == a2[0] && a1[2] == a2[2]) || 
                            (a1[0] == a2[2] && a1[2] == a2[0]);

        // Check odd indices (1 and 3)
        // They can either be in the same position or swapped
        boolean oddMatch = (a1[1] == a2[1] && a1[3] == a2[3]) || 
                           (a1[1] == a2[3] && a1[3] == a2[1]);

        return evenMatch && oddMatch;
    }
    
}
