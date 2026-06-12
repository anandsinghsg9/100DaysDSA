package Day_72.Anand;

public class reverseWords {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");

        StringBuilder ans = new StringBuilder();

        for(int i = words.length - 1; i >= 0; i--) {

            ans.append(words[i]);

            if(i != 0) {
                ans.append(" ");
            }
        }

        return ans.toString();
    }
    public static void main(String[] args) {
        reverseWords obj = new reverseWords();
        String s = "  hello world  ";
        System.out.println(obj.reverseWords(s));
    }
}
