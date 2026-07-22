package Day_85.Anand;

/**
 * RepeatedSubstring
 */
public class RepeatedSubstring {
    public boolean repeatedSubstringPattern(String s) {
        int len=s.length();
        for(int i=len/2;i>0;i--){
            if(len%i==0){
                String subStr=s.substring(0,i);
                StringBuilder newStr=new StringBuilder();
                for(int j=0;j<len/i;j++){
                    newStr.append(subStr);
                }
                if(newStr.toString().equals(s)){
                    return true;
                }
            }
        } 
        return false;
    }
    public static void main(String[] args) {
        RepeatedSubstring obj=new RepeatedSubstring();
        String s="abab";
        System.out.println(obj.repeatedSubstringPattern(s));
    }
}