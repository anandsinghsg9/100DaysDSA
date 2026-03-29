package Day_16.Sahil;

public class Main {

    public static boolean rotateString(String s, String goal) {
        int n = s.length();
        int m = goal.length();

        if (n != m) return false;

        String ans = s + s;

        if (ans.contains(goal)) return true;

        return false;
    }

    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";

        boolean result = rotateString(s, goal);

        System.out.println(result);
    }
}
