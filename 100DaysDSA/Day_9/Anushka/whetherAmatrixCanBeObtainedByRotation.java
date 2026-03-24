package Day_9.Anushka;

public class whetherAmatrixCanBeObtainedByRotation {

    public static void main(String[] args) {

        int[][] mat = {
            {0, 1},
            {1, 0}
        };

        int[][] target = {
            {1, 0},
            {0, 1}
        };

        boolean result = findRotation(mat, target);
        System.out.println(result);
    }

    public static boolean findRotation(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; i++) {
            if (isSame(mat, target)) return true;
            rotate(mat);
        }
        return false;
    }

    public static boolean isSame(int[][] a, int[][] b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i][j] != b[i][j]) return false;
            }
        }
        return true;
    }

    public static void rotate(int[][] mat) {
        int n = mat.length;

        // transpose
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        // reverse rows
        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;
            while (left < right) {
                int temp = mat[i][left];
                mat[i][left] = mat[i][right];
                mat[i][right] = temp;
                left++;
                right--;
            }
        }
    }
}