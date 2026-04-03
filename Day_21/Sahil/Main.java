package Day_21.Sahil;

public class Main {

    public static boolean check(int[] arr) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                count++;
            }
        }

        if (arr[n - 1] > arr[0]) count++;

        return count <= 1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};

        boolean result = check(arr);

        System.out.println(result);
    }
}
