package Day_45.Anushka;
public class countNumberOfSegments {
    public static int countSegments(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((i == 0 || s.charAt(i - 1) == ' ') && s.charAt(i) != ' ') {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "Hello, my name is John";
        System.out.println(countSegments(s));
    }
}
