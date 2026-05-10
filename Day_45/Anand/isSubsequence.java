package Day_45.Anand;

public class isSubsequence {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0){
            return true;
        }
        int i=0;
        int j=0;
        while(j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;
            if(i==s.length()){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        isSubsequence solution=new isSubsequence();
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(solution.isSubsequence(s, t));
    }
}
