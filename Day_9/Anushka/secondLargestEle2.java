package Day_9.Anushka;

public class secondLargestEle2 {
    public static void main(String[] args) {
        int[]arr = { 12 , 35 , 1 ,10 , 34 , 1};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
         // finding the second largest element
         for(int i = 0 ; i < arr.length ; i++){
            if (arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i] < largest && arr[i] > secondLargest){
                secondLargest = arr[i];
            }
         }
         System.out.println("Second Larget element is : " + secondLargest);

    }
}
//Time Complexity: O(n), as we are traversing the array only once.
//Auxiliary space: O(1)
