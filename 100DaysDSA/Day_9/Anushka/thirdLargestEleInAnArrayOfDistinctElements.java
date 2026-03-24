package Day_9.Anushka;

public class thirdLargestEleInAnArrayOfDistinctElements {
    public static void main(String[] args) {
        int[] arr = {1, 14, 2, 16, 10, 20};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = num;
            } 
            else if (num > secondLargest && num < largest) {
                thirdLargest = secondLargest;
                secondLargest = num;
            } 
            else if (num > thirdLargest && num < secondLargest) {
                thirdLargest = num;
            }
        }

        System.out.println("Third Largest: " + thirdLargest);
    }
}