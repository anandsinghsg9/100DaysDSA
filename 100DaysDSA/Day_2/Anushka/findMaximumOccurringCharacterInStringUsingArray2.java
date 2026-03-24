package Day_2.Anushka;

public class findMaximumOccurringCharacterInStringUsingArray2 {
    public static void main(String[] args) {

        // Step 1: Create a string
        String s = "testsample";

        // Step 2: Create a frequency array of size 26 for letters a–z
        int[] freq = new int[26];

        // Step 3: Traverse the string and count frequency of each character
        // Convert character to index using (ch - 'a')
        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }

        // Step 4: Assume maximum frequency initially as 0
        int maxFrequency = 0;

        // Step 5: Variable to store the answer character
        char answer = 'a';

        // Step 6: Traverse the frequency array
        for(int i = 0 ; i < 26 ; i++){

            // Step 7: Check if current frequency is greater than maxFrequency
            if (freq[i] > maxFrequency){

                // Step 8: Update maxFrequency
                maxFrequency = freq[i];

                // Step 9: Convert index back to character
                answer = (char)(i + 'a');
            }
        }

        // Step 10: Print the character with maximum frequency
        System.out.println(answer);
    }
}