package Anushka;
public class callStackExample {

    public static void print(int n) {
        if (n == 0)
            return;

        System.out.print(n + " ");

        print(n - 1);
    }

    public static void main(String[] args) {
        int n = 3;
        print(n);
    }
}