package Day_14.Anushka;

public class rotateAmatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int[] firstRow = matrix[0]; 

        // shift rows up
        for(int i = 0; i < matrix.length - 1; i++){
            matrix[i] = matrix[i + 1];
        }

        matrix[matrix.length - 1] = firstRow; 

        printMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}