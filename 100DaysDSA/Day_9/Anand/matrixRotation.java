import java.util.Arrays;

class matrixRotation{
    public static void main(String[] args) {
        int[][] mat={{0,1},{1,0}};
        int[][] target={{1,0},{0,1}};
        matrixRotation solution= new matrixRotation();
        System.out.println("The target is identical after rotation is"+" "+solution.findRotation(mat, target));
    }
    
    public boolean findRotation(int[][] mat, int[][] target) {
        int n=target.length;
        for(int r=0;r<4;r++){
            if(Arrays.deepEquals(mat,target)){
                return true;
            }
            int[][] answer=new int[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    answer[i][j]=mat[j][n-1-i];
                }
            }
            mat=answer;
        }
        return false;
    }
}