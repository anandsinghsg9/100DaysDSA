package Anushka;

public class arraningCoinsMathematicalWay {

    public static int squareRoot(int n) {

        int ans = 0;

        long low = 0;
        long high = n;

        while(low <= high) {

            long mid = (low + high) / 2;

            if(mid * mid <= n) {

                ans = (int)mid;
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public static int arrangeCoins(int n) {

        return (-1 + squareRoot(1 + 8 * n)) / 2;
    }

    public static void main(String[] args) {

        int n = 5;

        System.out.println(arrangeCoins(n));
    }
}