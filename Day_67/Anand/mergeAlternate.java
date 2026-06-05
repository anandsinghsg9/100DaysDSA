package Day_67.Anand;

public class mergeAlternate {
    public String mergeAlternately(String word1, String word2) {
        int up=0;
        int down=0;
        String output="";
        while(up<word1.length() && down<word2.length()){
            output+=word1.charAt(up);
            output+=word2.charAt(down);
            up++;
            down++;
        }
        while(up<word1.length()){
            output+=word1.charAt(up);
            up++;
        }
        while(down<word2.length()){
            output+=word2.charAt(down);
            down++;
        }
        return output;
    }
    public static void main(String[] args) {
        mergeAlternate obj=new mergeAlternate();
        String word1="abc";
        String word2="pqr";
        System.out.println(obj.mergeAlternately(word1, word2));
    }
}
