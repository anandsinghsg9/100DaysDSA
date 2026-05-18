public class floodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int original= image[sr][sc];
        if(original==color){
            return image;
        }
        dfs(image,sr,sc,original,color);
        return image;
    }
    private void dfs(int[][]image, int sr, int sc, int original,int color){
        int column=image[0].length;
        int rows=image.length;
        if(sr<0 || sc<0|| sr>=rows || sc>=column || image[sr][sc]!=original ){
            return;
        }
        image[sr][sc]=color;
        dfs(image,sr+1,sc,original,color);
        dfs(image,sr-1,sc,original,color);
        dfs(image,sr,sc+1,original,color);
        dfs(image,sr,sc-1,original,color);
    }
    public static void main(String[] args) {
        floodFill solution = new floodFill();
        int[][] image = {
            {1, 1, 1},
            {1, 1, 0},
            {1, 0, 1}
        };
        int sr = 1;
        int sc = 1;
        int color = 2;
        int[][] result = solution.floodFill(image, sr, sc, color);
        System.out.println("Flood filled image:");
        for (int[] row : result) {
            for (int pixel : row) {
                System.out.print(pixel + " ");
            }
            System.out.println();
        }
    }
}
