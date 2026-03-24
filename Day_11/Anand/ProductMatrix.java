package Anand;
import java.util.Arrays;

public class ProductMatrix {

    public static void main(String[] args) {
        int[][] grid = {
            {1, 2},
            {3, 4}
        };

        ProductMatrix sol = new ProductMatrix();
        int[][] result = sol.constructProductMatrix(grid);

        System.out.println("Constructed Product Matrix:");
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }

    public int[][] constructProductMatrix(int[][] grid) {
        int row = grid.length;
        int column = grid[0].length;
        int MOD = 12345;
        
        long product = 1;
        long product2 = 1;
        int[][] result = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                result[i][j] = (int) (product % MOD);
                product = (product * (grid[i][j] % MOD)) % MOD;
            }
        }
            
        for (int i = row - 1; i >= 0; i--) {
            for (int j = column - 1; j >= 0; j--) {
                result[i][j] = (int) ((product2 * result[i][j]) % MOD);
                product2 = (product2 * (grid[i][j] % MOD)) % MOD;
            }
        }

        return result;
    }
}