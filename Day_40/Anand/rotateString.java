package Anand;

public class rotateString {
    
    public boolean rotateString(String s, String goal) {
        int len1=s.length();
        int len2=goal.length();
        if(len1!=len2){
            return false;
        }
        String check=new String();
        check=s+s;
        if(check.contains(goal)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        
        rotateString sol=new rotateString();
        String s="abcde";
        String goal="cdeab";
        System.out.println(sol.rotateString(s, goal));
    }
}
