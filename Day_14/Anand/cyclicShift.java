package Day_14.Anand;

public class cyclicShift {
    public static void main(String[] args) {
        int[][] mat={{1,2,3},{4,5,6},{7,8,9}};
        int k=4;
        cyclicShift sol=new cyclicShift();
        System.out.println(sol.areSimilar(mat, k));

    }
    public boolean areSimilar(int[][] mat, int k) {
        int l=mat[0].length;
        int m=mat.length;
        k=k%l;
        int j=0;
        int start=0;
        int stop=1;
        while(start<m){
            if(mat[start][j]!=mat[start][(j+k)%l]){
                return false;
            }
            j++;
            if(j==l){
                start=start+2;
                j=0;
            }
        }
        while(stop<m){
            if(mat[stop][j]!=mat[stop][(j+k)%l]){
                return false;
            }
            j++;
            if(j==l){
                stop=stop+2;
                j=0;
            }
        }return true;
    }
}
