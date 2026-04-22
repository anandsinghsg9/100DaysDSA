package Day_37.Anushka;

public class divide2Integers {

    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 3;

        divide2Integers obj = new divide2Integers();
        int result = obj.divide(dividend, divisor);

        System.out.println("Answer: " + result);
    }

    public int divide(int dividend, int divisor) {

        // edge case (overflow)
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        // check sign
        boolean negative = (dividend < 0) ^ (divisor < 0);

        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);

        int result = 0;

        while (dvd >= dvs) {
            long temp = dvs;
            int multiple = 1;

            // double divisor using bit shift
            while (dvd >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }

            dvd -= temp;
            result += multiple;
        }

        return negative ? -result : result;
    }
}