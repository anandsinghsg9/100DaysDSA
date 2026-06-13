public class subsequences {
    public static void main(String[] args) {
        String s = "abcd";
        subSequences("", 0  , new StringBuilder(s));
    }
    private static void subSequences(String ans , int index , StringBuilder s){
        if(index == s.length()){
            System.out.println(ans);
            return;
    }
    //pick
    subSequences(ans + s.charAt(index), index + 1, s);
    subSequences(ans, index + 1, s);
    }
}
