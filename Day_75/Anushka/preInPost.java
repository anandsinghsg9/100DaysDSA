
public class preInPost {
    public static void main(String[] args) {
        int n = 3;
        fun(n);
    }
    static void fun(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        fun(n - 1);
        System.out.println(n);
        fun(n - 1);
        System.out.println(n);
    }
}



public class preInPost {

    public static void main(String[] args) {
        System.out.println("Hello DSA");
    }
}
