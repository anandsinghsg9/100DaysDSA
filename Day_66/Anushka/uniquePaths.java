public class uniquePaths {

    public void printPaths(int destinationRow, int destinationColumn) {
        helper(1, 1, destinationRow, destinationColumn, "");
    }

    private void helper(int currentRow, int currentCol,
                        int destinationRow, int destinationColumn,
                        String path) {

        if (currentRow == destinationRow &&
            currentCol == destinationColumn) {
            System.out.println(path);
            return;
        }

        if (currentRow > destinationRow ||
            currentCol > destinationColumn) {
            return;
        }

        helper(currentRow, currentCol + 1,
               destinationRow, destinationColumn,
               path + "R");

        helper(currentRow + 1, currentCol,
               destinationRow, destinationColumn,
               path + "D");
    }

    public static void main(String[] args) {

        uniquePaths obj = new uniquePaths();

        obj.printPaths(3, 3);
    }
}