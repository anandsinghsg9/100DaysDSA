import java.util.HashMap;

public class isAnagram {
    public boolean anagram(String s, String t) {
        HashMap <Character,Integer> set=new HashMap<>();
        if(s.length()!=t.length()){
            return false;
            }
        else{
            for(int i=0;i<s.length();i++){
                set.put(s.charAt(i),set.getOrDefault(s.charAt(i),0)+1);
            }
            for(int i=0;i<t.length();i++){
                if(!set.containsKey(t.charAt(i))||set.get(t.charAt(i))==0){
                    return false;
                }
                else{
                    set.put(t.charAt(i),set.get(t.charAt(i))-1);
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s="anagram";
        String t="nagaram";
        isAnagram Solution =new isAnagram();
        boolean sol = Solution.anagram(s, t);
        System.out.println(sol);
    }
}
