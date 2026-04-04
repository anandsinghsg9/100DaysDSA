package Day_22.Anushka;

public class decodeSlantedCipherText {
    public static void main(String[] args) {
         String encodedText = "ch   ie   pr";
         int rows = 3;
         System.out.println(decode(encodedText , rows));
    }
    public static String decode(String encodedText , int rows){
        if(rows == 1) return encodedText;
        int n = encodedText.length();
        int cols = n/rows;
                char[][] mat = new char[rows][cols];
        int idx = 0;

        // fill matrix row-wise
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                mat[i][j] = encodedText.charAt(idx++);
            }
        }

        StringBuilder result = new StringBuilder();

        // read diagonally
        for(int j = 0; j < cols; j++){
            int i = 0, k = j;

            while(i < rows && k < cols){
                result.append(mat[i][k]);
                i++;
                k++;
            }
        }

        // remove trailing spaces
        return result.toString().stripTrailing();

    }
}
