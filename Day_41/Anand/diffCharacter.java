package Day_41.Anand;

import java.util.HashMap;

public class diffCharacter {
    public char findTheDifference(String s, String t) {
        HashMap <Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }
        Character result= 0;
        for(int i=0;i<t.length();i++){
            if(map.containsKey(t.charAt(i)) && map.get(t.charAt(i))>0){
                map.put(t.charAt(i), map.get(t.charAt(i))-1);
            }
            else{
                result= t.charAt(i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String s="abcd";
        String t="abcde";
        diffCharacter solution=new diffCharacter();
        System.out.println(solution.findTheDifference(s, t));
    }
}
