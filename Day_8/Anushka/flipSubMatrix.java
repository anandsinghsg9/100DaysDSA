package Day_8.Anushka;
public class flipSubMatrix {
    public static void main(String[] args) {
        int[][]grid = {
            {1 , 2 , 3, 4},
            {5 , 6 , 7 , 8},
            {9 , 10 , 11 , 12},
            {13 , 14 , 15 , 16}
        };
         int x = 1;
        int y = 0;
        int k = 3;

       int[][]result = reverseSubMatrix(grid , x , y , k);
        for(int i = 0 ; i < result.length ; i++){
            for(int j = 0 ; j < result[0].length ; j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println("");
       }
    }
    public static int[][] reverseSubMatrix(int[][]grid , int x , int y , int k){
            int startRow = x;
            int endRow = x + k - 1;

            int startColumn = y ; 
            int endColumn = y + k - 1;

            for (int i = startRow ; i < endRow ; i++){
                for (int j = startColumn ; j < endColumn ; j++){
                    //swapping
                    int temp = grid[i][j];
                    grid[i][j] = grid[endRow][j];
                    grid[endRow][j] = temp;
                }
                startColumn++;
                endRow--;
            }
            return grid;
    }

}
