package Day_2.Sahil;

public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if(n==1){
            return true;
        }
        if(n%2==0){
            while(n>0){
                n = n / 2;
                if(n == 1){
                    return true;
                }
                if(n%2 != 0){
                    return false;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        PowerOfTwo p = new PowerOfTwo();
        System.out.println(p.isPowerOfTwo(1)); // true
        System.out.println(p.isPowerOfTwo(2)); // true
        System.out.println(p.isPowerOfTwo(3)); // false
        System.out.println(p.isPowerOfTwo(4)); // true
    }
}
