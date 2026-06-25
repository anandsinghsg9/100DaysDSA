package Day_79.Anand;

public class isSubsequence {
    public boolean isSubsequence(String s, String t) {
        int a=0;
        int b=0;
        while(a<s.length() && b<t.length()){
            if(s.charAt(a)==t.charAt(b)){
                a++;
                b++;
            }
            else{
                b++;
            }
        }
        return a==s.length();
    }
    public static void main(String[] args) {
        isSubsequence obj=new isSubsequence();
        String s="abc";
        String t="ahbgdc";
        System.out.println(obj.isSubsequence(s,t));
    }
}
