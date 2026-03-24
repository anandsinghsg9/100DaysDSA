package Day_4.Anushka;
import java.util.HashMap;
public class validAnagram {
    public static void main(String[] args){
        String s = "listen";
        String t = "silent";
        boolean result = isAnagram(s, t); // fixed
        if(result){
            System.out.println("Anagram");
        }else {
            System.out.println("Not an Anagram");
        }
    }
    public static boolean isAnagram(String s , String t){
        if(s.length() != t.length()) return false;
        HashMap<Character , Integer> sMap = new HashMap<>(); 
        for (char ch : s.toCharArray()){
            if(sMap.containsKey(ch)){
                int sfreq = sMap.get(ch);
                sMap.put(ch , sfreq + 1); // fixed
            }
            else {
                sMap.put(ch , 1);
            }
        }
        for(char ch : t.toCharArray()){
            if(!sMap.containsKey(ch)){
                return false;
            }
            int freq = sMap.get(ch) - 1;
            sMap.put(ch , freq);
            if(sMap.get(ch) == 0){
                sMap.remove(ch);
            }
        }
        return sMap.isEmpty();
    }
}
