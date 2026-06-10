public class numberOfPaths {

    public int numberOfPathsNumber(int destinationRow, int destinationColumn) {
        return helper(1, 1, destinationRow, destinationColumn);
    }

    private int helper(int currentRow, int currentCol,
                       int destinationRow, int destinationColumn) {

        if (currentRow == destinationRow &&
            currentCol == destinationColumn) {
            return 1;
        }

        if (currentRow > destinationRow ||
            currentCol > destinationColumn) {
            return 0;
        }

        int rightWays =
                helper(currentRow, currentCol + 1,
                       destinationRow, destinationColumn);

        int downWays =
                helper(currentRow + 1, currentCol,
                       destinationRow, destinationColumn);

        return rightWays + downWays;
    }

    public static void main(String[] args) {

        numberOfPaths obj = new numberOfPaths();

        System.out.println(obj.numberOfPathsNumber(3, 3));
    }
}