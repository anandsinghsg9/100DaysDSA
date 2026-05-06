package Day_43.Anand;

public class countSegment {
    public int countSegments(String s) {
        int count = 0;
        for(int i = 0 ; i < s.length() ; i++){
             if (s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' ')) {
                count++;
        }
    }
        return count;
    }
    public static void main(String[] args) {
        countSegment solution = new countSegment();
        String input = "Hello, my name is Anand";
        int result = solution.countSegments(input);
        System.out.println("Number of segments: " + result);
    }
}
