package Day_23.Anushka;

public class robotReturnToOrigin {

    public static boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;

        for (char ch : moves.toCharArray()) {
            if (ch == 'U') y++;
            else if (ch == 'D') y--;
            else if (ch == 'L') x--;
            else if (ch == 'R') x++;
        }

        return x == 0 && y == 0;
    }

    public static void main(String[] args) {
        String moves = "UDLR";
        System.out.println(judgeCircle(moves));
    }
}