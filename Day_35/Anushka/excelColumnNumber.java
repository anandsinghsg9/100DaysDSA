package Day_35.Anushka;

public class excelColumnNumber {

    public static int titleToNumber(String columnTitle) {
        int result = 0;

        for (int i = 0; i < columnTitle.length(); i++) {
            char ch = columnTitle.charAt(i);
            int value = ch - 'A' + 1;
            result = result * 26 + value;
        }

        return result;
    }

    public static void main(String[] args) {
        String columnTitle = "ZY";
        System.out.println(titleToNumber(columnTitle)); // Output: 701
    }
}