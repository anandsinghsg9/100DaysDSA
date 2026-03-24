package Anand;

import java.util.Arrays;

public class BruteForce {
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
        int row =grid.length;
        int column=grid[0].length;
        int product=1;
        int [][]result=new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                product=product*(grid[i][j]);
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                result[i][j]=(product/grid[i][j])%12345;
            }
        }
        return result;
    }
}
