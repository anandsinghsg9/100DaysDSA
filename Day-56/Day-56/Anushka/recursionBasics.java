public class recursionBasics {
    static int n = 0;
    public static void main(String[] args) {
        shivam();
    }
    private static void shivam(){
        if (n == 5) return;
        System.err.println("Harsh");
        n++;
        shivam();
    }
}
