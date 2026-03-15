package Day_2.Anushka;
public class findMaximumOccurringCharacterInStringUsingArray {
    public static void main(String[] args) {
          String str = "banana";
          //Count frequency of each character , 
          //find the maximum frequency , 
          //If two characters have same frequency, 
          //choose the lexicographically smaller one , 
          //because we check from 'a' → 'z', the smaller character automatically comes first.
        int[] arr = new int[26];
        for(int i = 0; i < str.length(); i++){
            arr[str.charAt(i) - 'a']++;
        }
        int maxIndex = 0;
        for(int i = 1; i < 26; i++){
            if(arr[i] > arr[maxIndex]){
                maxIndex = i;
            }
        }
        System.out.println((char)(maxIndex + 'a'));
      
    }
}
