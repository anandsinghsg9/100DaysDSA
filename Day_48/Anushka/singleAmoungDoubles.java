

public class singleAmoungDoubles {

    public static int single(int[] arr) {

        int low = 0;
        int high = arr.length - 1;

        while(low <= high) {

            int mid = (low + high) / 2;

            // element right side equal
            if(mid < arr.length - 1 && arr[mid] == arr[mid + 1]) {

                int first = mid;
                int second = mid + 1;

                int leftLength = first - low;
                int rightLength = high - second;

                // if right search space is odd
                if(rightLength % 2 != 0) {

                    low = mid + 2;
                }
                else {

                    high = mid - 1;
                }
            }

            // element left side equal
            else if(mid > 0 && arr[mid] == arr[mid - 1]) {

                int first = mid - 1;
                int second = mid;

                int leftLength = first - low;
                int rightLength = high - second;

                // if left search space is odd
                if(leftLength % 2 != 0) {

                    high = mid - 2;
                }
                else {

                    low = mid + 1;
                }
            }

            // single element
            else {

                return arr[mid];
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {1,1,2,2,3,3,4,50,50,65,65};

        System.out.println(single(arr));
    }
}