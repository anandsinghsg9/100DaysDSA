public class allPossibleSubsequences {
    public static void main(String[] args) {
        String s = "xyz";
        subsequences(" " , 0 , new StringBuilder(s));
    }
    private static void subsequences(String ans , int index , StringBuilder s){
        if(index == s.length()){
            System.out.println(ans);
            return;
        }
        subsequences(ans + s.charAt(index),index + 1 ,  s); //pick
        subsequences(ans, index + 1, s); //skip
    }
}
