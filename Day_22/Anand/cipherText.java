package Day_22.Anand;

public class cipherText {
    public String decodeCiphertext(String encodedText, int rows) {
        int n = encodedText.length();
        int cols = n / rows;
        StringBuilder sb = new StringBuilder();
        
        // We start each diagonal from the top row (row 0)
        // Each starting point is (0, i) where i is the column index
        for (int i = 0; i < cols; i++) {
            int r = 0;
            int c = i;
            
            // Follow the diagonal down until we hit a boundary
            while (r < rows && c < cols) {
                // Calculate the index in the 1D encodedText string
                // 1D index = current_row * total_cols + current_col
                int index = r * cols + c;
                sb.append(encodedText.charAt(index));
                
                // Move diagonally
                r++;
                c++;
            }
        }
        
        // The problem states originalText does not have trailing spaces.
        // During encoding, empty cells were filled with ' ', so we trim only the end.
        return trimTrailingSpaces(sb.toString());
    }
    
    private String trimTrailingSpaces(String s) {
        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        return s.substring(0, i + 1);
    }
    public static void main(String[] args) {
        cipherText sol = new cipherText();

        // Example 1
        String encoded1 = "ch   ie   pr";
        int rows1 = 3;
        System.out.println("Test 1: [" + sol.decodeCiphertext(encoded1, rows1) + "]"); 
        // Expected: [cipher]

        // Example 2
        String encoded2 = "iveo    eed   l te   olc";
        int rows2 = 4;
        System.out.println("Test 2: [" + sol.decodeCiphertext(encoded2, rows2) + "]"); 
        // Expected: [i love leetcode]

        // Example 3: Single Row
        String encoded3 = "coding";
        int rows3 = 1;
        System.out.println("Test 3: [" + sol.decodeCiphertext(encoded3, rows3) + "]"); 
        // Expected: [coding]
    }
}
