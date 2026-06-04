public class print1toN {
    static void printFrom1(int i , int n){
        if(i > n){
            return;
        }
        System.out.println(i);
        printFrom1(i + 1, n);
    }
    public static void main(String[] args) {
        int n = 10;
        printFrom1(1 , n);
    }
}


