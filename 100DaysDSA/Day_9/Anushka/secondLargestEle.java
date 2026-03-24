package Day_9.Anushka;

public class secondLargestEle {
    public static void main(String[] args) {
        int[]arr = { 12 , 3 , 44 , 800};
        int ans = getSecondLargestEle(arr);
        System.out.println("Second largest : " + ans);
        
    }
    static int getSecondLargestEle(int[]arr){
        int n = arr.length;
        int largest = -1;
        int secondLargest = -1;

        //find largest Element
        for(int i = 0 ; i < n ; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
            //finding secondLargestElement
            for(int i = 0 ; i < n ; i++){
                if(arr[i] > secondLargest && arr[i] != largest){
                    secondLargest = arr[i];
                }
            }
            return secondLargest;
    }
}
//Time Complexity: O(2*n) = O(n), as we are traversing the array two times.
//Auxiliary space: O(1), as no extra space is required.
