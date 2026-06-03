import java.util.Arrays;

public class sortColoursOptimised {

    public void sortColours(int[] arr) {

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count0++;
            } else if (arr[i] == 1) {
                count1++;
            } else {
                count2++;
            }
        }

        int index = 0;

        while (count0 > 0) {
            arr[index] = 0;
            index++;
            count0--;
        }

        while (count1 > 0) {
            arr[index] = 1;
            index++;
            count1--;
        }

        while (count2 > 0) {
            arr[index] = 2;
            index++;
            count2--;
        }
    }

    public static void main(String[] args) {

        int[] arr = {2, 0, 2, 1, 1, 0};

        sortColoursOptimised obj = new sortColoursOptimised();

        obj.sortColours(arr);

        System.out.println(Arrays.toString(arr));
    }
}