public class hcf {
    public static int highestCommonFactor(int a, int b) {
        if (b == 0) {
            return a;
        }
        return highestCommonFactor(b, a % b);
    }
    public static void main(String[] args) {
        int a = 12;
        int b = 18;

        System.out.println(highestCommonFactor(a, b));
    }
}