public class setZeroesBetterApproach {

    public static void setZeroes(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] rowMarker = new int[rows];
        int[] colMarker = new int[cols];

        // Mark rows and columns containing 0
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (matrix[i][j] == 0) {
                    rowMarker[i] = 1;
                    colMarker[j] = 1;
                }
            }
        }

        // Make cells zero
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (rowMarker[i] == 1 || colMarker[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[][] matrix = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };

        setZeroes(matrix);

        // Print matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}