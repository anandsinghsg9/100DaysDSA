import java.util.Arrays;

class flipSquareSubmatrixVertically {
    public static void main(String[] args) {
        int[][] grid= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int x=1;
        int y=0;
        int k=3;
        flipSquareSubmatrixVertically solution= new flipSquareSubmatrixVertically();
        System.out.println("The flipped submatrix is as follows"+" "+Arrays.deepToString(solution.reverseSubmatrix(grid, x, y, k)));
    }
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int row=x;
        int column=y;
        int a= k/2;
        for(int j=0;j<k;j++){
            for (int i=0;i<a;i++){
                int temp=grid[row+i][column+j];
                grid[row+i][column+j]=grid[row+k-1-i][column+j];
                grid[row+k-1-i][column+j]=temp;
            }
        }
        return grid;
    }
}