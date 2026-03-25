package Day_11.Anushka;

public class gridPartitionCheck {
    public static void main(String[] args) {
        int[][]grid = {
            {1 , 4},
            {2 , 3}
        };
        System.out.println(canPartitionGrid(grid));
    }
    public static boolean canPartitionGrid(int[][]grid){
        int rows = grid.length;
        int cols = grid[0].length;
        int totalSum = 0;
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < cols ; j++){
                totalSum = totalSum + grid[i][j];
            }
        }
        int topPartSum = 0;
        for(int i = 0 ; i < rows - 1 ; i++){
            for(int j = 0 ; j < cols ; j++){
                topPartSum = topPartSum + grid[i][j];
            }
            int bottomPartSum = totalSum - topPartSum;

            if(topPartSum == bottomPartSum){
                return true;
            }
        }
        int leftPartSum = 0;
        for (int j = 0 ; j < cols - 1 ; j++){
            for(int i = 0 ; i < rows ; i++){
                leftPartSum = leftPartSum + grid[i][j];
            }
            int rightPartSum = totalSum - leftPartSum;
            if(leftPartSum == rightPartSum){
                return true;
            }
        }
        return false;
    }
}
