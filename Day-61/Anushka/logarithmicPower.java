public class logarithmicPower {
    public static int power(int a , int b){
        if(b == 0){
            return 1;
        }
        int half = power(a , b/2);

        if(b % 2 == 0){
            return half * half;
        }else{
            return a * half * half;
        }
    }
    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        System.err.println(power(a, b));
    }
}
