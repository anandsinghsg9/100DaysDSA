package Anand;

public class pow{
    public double myPow(double x, double n) {
        long power = (long) n;
        if (power < 0) {
            x = 1 / x;
            power = -power;
        }
        double answer = 1;
        while (power > 0) {
            if (power % 2 == 1) {
                answer = answer * x;
            }
            x = x * x;
            power = power / 2;
        }
        return answer;
    }
    public static void main(String[] args) {
        double x = 2.00000;
        double n = 10;
        pow pow = new pow();
        System.out.println(pow.myPow(x, n));
    }
    
}
