import java.util.HashMap;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int left=0;
        int result=0;
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                left=Math.max(left,map.get(s.charAt(i))+1);
                map.remove(s.charAt(i));
                map.put(s.charAt(i),i);
            }
            else{
                map.put(s.charAt(i),i);
            }
            result=Math.max(result,i-left+1);
        }
        return result;
    }
    public static void main(String[] args) {
        String s="abcabcbb";
        Solution Sol=new Solution();
        int result= Sol.lengthOfLongestSubstring(s);
        System.out.println("The length of longest Substring is "+ result);
    }
}