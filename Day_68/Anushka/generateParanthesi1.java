import java.util.*;

public class generateParanthesi1 {

    public ArrayList<String> generateParanthesis(int n) {
        ArrayList<String> result = new ArrayList<>();
        solve(result, "", 0, 0, n / 2);
        return result;
    }

    private void solve(ArrayList<String> result, String current,
                       int open, int close, int max) {

        if (current.length() == max * 2) {
            result.add(current);
            return;
        }

        if (open < max) {
            solve(result, current + "(", open + 1, close, max);
        }

        if (close < open) {
            solve(result, current + ")", open, close + 1, max);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        generateParanthesi1 obj = new generateParanthesi1();
        ArrayList<String> ans = obj.generateParanthesis(n);

        System.out.println(ans);
    }
}