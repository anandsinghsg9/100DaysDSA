package Day_43.Anushka;

public class rotatedString {

    public static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        String goalString = s + s;

        if (goalString.contains(goal)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";

        System.out.println(rotateString(s, goal));
    }
}