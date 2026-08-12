package Day_78.Anushka;

public class lookAndSayPattern {
    public static String countAndSay(int n){
        if(n == 1){
            return "1";
        }
        
        String s = countAndSay(n - 1);
        StringBuilder ans = new StringBuilder();
        int i = 0;
        int j = 0;
        while(j < s.length()){
            if(s.charAt(i) == s.charAt(j)){
                j++;
            }else {
                int len = j - i ;
                ans.append(len);
                ans.append(s.charAt(i));
                i = j;
            }
        }
        int len = j - i ;
        ans.append(len);
        ans.append(s.charAt(i));
        i = j;
        return ans.toString();
    }
    public static void main(String[] args) {
        int n = 1;
        System.out.println("Count and say for 1 : " + countAndSay(n));
        System.out.println("Count and say for 2 : " + countAndSay(n + 1));
        System.out.println("Count and say for 3 : " + countAndSay(n + 2));
        System.out.println("Count and say for 4 : " + countAndSay(n + 3));
        System.out.println("Count and say for 5 : " + countAndSay(n + 4));

    }
}
