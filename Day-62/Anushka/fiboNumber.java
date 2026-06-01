public class fiboNumber {
    public static void main(String[] args) {
        int n = 10;
        int result = fibonacciNumber(n);
        System.out.println(result);
    }
    public static int fibonacciNumber(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return fibonacciNumber(n - 1) + fibonacciNumber(n - 2);

    }
}
