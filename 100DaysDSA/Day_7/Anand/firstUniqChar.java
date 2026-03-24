import java.util.HashMap;

public class firstUniqChar {
    public int chara(String s) { 
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }  
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String s="leetcode";
        firstUniqChar a=new firstUniqChar();
        int solution= a.chara(s);
        System.out.println("The index of first unique character is"+" "+ solution);
    }
}

