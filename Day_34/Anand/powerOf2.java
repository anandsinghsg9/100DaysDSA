package Day_34.Anand;

public class powerOf2 {
    public boolean isPowerOfTwo(int n) {
        if(n<0){
            return false;
        }
        return (n & (n-1))==0;
    }
    public static void main(String[] args) {
        int n=8;
        powerOf2 sol=new powerOf2();
        System.out.println(sol.isPowerOfTwo(n));
    }   
}
