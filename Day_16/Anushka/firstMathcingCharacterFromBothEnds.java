package Day_16.Anushka;

public class firstMathcingCharacterFromBothEnds {
    public static void main(String[] args) {
        String s = "abcacbd";
        System.out.println(smallestIndex(s));
    }
    public static int smallestIndex(String s){
        int n = s.length();
        for(int i = 0 ; i < n ; i++){
            if(s.charAt(i) == s.charAt(n - i - 1)){
                return i;
            }
        }
        return -1;
    }
}
