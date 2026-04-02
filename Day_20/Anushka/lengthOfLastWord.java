package Day_20.Anushka;
public class lengthOfLastWord {
    public static int lengthOfLastWordFunc(String s) {
        int i = s.length() - 1;
        int count = 0;
        // skip trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        // count last word
        while (i >= 0 && s.charAt(i) != ' ') {
            count++;
            i--;
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        int result = lengthOfLastWordFunc(s);
        System.out.println("Length of last word: " + result);
    }
}