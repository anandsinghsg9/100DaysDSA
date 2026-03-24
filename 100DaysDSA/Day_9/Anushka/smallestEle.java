package Day_9.Anushka;
public class smallestEle {
    public static void main(String[] args) {
        int[]arr = { 12 , 25 , 8 , 10 , 33 , 17 , 11};
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
            else if (arr[i] > smallest && arr[i] <secondSmallest){
                secondSmallest = arr[i];
            }
        }
        System.out.println("Smallest Element of the array is : " + smallest);
        System.out.println("Second smallest Element of the array is : " + secondSmallest);
    }
}
