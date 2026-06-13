public class passingStringsToMethods2 {
    public static void main(String[] args) {
        String s = "Anushka";
        change(s);
        System.out.println(s);
    }
    private static void change(String s){
        s = "Yuvraj";
    }
}
