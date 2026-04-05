package Day_23.Sahil;

public class Main {

    public static int singleNumber(int[] arr) {
        int n = arr.length;

        if (n == 1) return arr[0];

        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count == 1) {
                return arr[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};

        int result = singleNumber(arr);

        System.out.println(result);
    }
}
