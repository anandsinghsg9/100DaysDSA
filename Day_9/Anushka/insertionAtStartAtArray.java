package Day_9.Anushka;
public class insertionAtStartAtArray {
    public static void main(String[] args) {
        int[]arr = { 10 , 20 , 30 , 40 , 0};
        int n = 4;
        int ele = 500;

        // i = 4 -1 = 3 , arr[3] = 40 arr[] = [10 , 20 , 30 , 40]
        //i = 3 - 1 = 2 , arr[2] = 30 , arr[10 , 20 , 30 , 30 , 40]
        //i = 1 , ARR[1] = 20 , arr[10 , 20 , 20 , 30 , 40]
        //i = 0 , arr = [110 , 10 , 20 , 30 , 40]

        for (int i = n - 1 ; i >= 0 ; i--){
            arr[i+1] = arr[i];
        }
        //insert at start , arr = [500 , 10 , 20 , 30 , 40]
        arr[0] = ele;
        for(int i = 0 ; i <= n ; i++){
            System.out.println(arr[i]+ " ");
        }
    }
}
//Time Complexity: O(n), where n is the size of the array.
