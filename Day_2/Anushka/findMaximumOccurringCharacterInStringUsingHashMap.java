package Day_2.Anushka;
import java.util.*;
public class findMaximumOccurringCharacterInStringUsingHashMap {
    public static void main(String[] args) {
        String str = "TestSample";

        //Create a HashMap to store character → frequency
        HashMap<Character , Integer> map = new HashMap<>();

        //Traverse the string and count frequency
        for(char ch : str.toCharArray()){
            map.put( ch , map.getOrDefault(ch, 0) + 1);
        }
        //Assume maximum frequency initially
        int maxFrequency = 0;

        char answer = 'a';
        for (char key : map.keySet()){
            int freq = map.get(key);

            if(freq > maxFrequency){
                answer = key;
            } else if(freq == maxFrequency && key < answer){
                answer = key;
            }
        }
          System.out.println(answer);
        
    }
}
