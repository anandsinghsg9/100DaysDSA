public class rotateMatrixBy90Degrees {
    public void rotateMatrix(int[][] matrix) {
        int n = matrix.length;
        // Create rotated matrix
        int[][] rotated = new int[n][n];
        // Rotate
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - i - 1] = matrix[i][j];
            }
        }
        // Print rotated matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(rotated[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        RotateMatrixBy90Degrees obj = new RotateMatrixBy90Degrees();
        obj.rotateMatrix(matrix);
    }
}