public class searchInAsortedMatrix {
    public static boolean searchMatrix(int[][] arr, int target) {

        int rows = arr.length;
        int cols = arr[0].length;

        int low = 0;
        int high = rows * cols - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int midRow = mid / cols;
            int midCol = mid % cols;

            if (arr[midRow][midCol] > target) {

                high = mid - 1;

            } else if (arr[midRow][midCol] < target) {

                low = mid + 1;

            } else {

                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[][] matrix = {
            {1, 5, 9},
            {14, 20, 21},
            {30, 34, 43}
        };

        int target = 14;

        boolean ans = searchMatrix(matrix, target);

        System.out.println(ans);
    }
}