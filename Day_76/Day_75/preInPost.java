public class preInPost {
    public static void func(int n) {
        if (n == 0) return;
        // Pre
        System.out.print(n);
        func(n - 1);

        // In
        System.out.print(n);
        func(n - 1);

        // Post
        System.out.print(n);
    }
    public static void main(String[] args) {
        int n = 3;
        func(n);
        System.out.println();
    }
}