import java.util.*;
public class findNumberOfSpecialCharacters {
    public static int numberOfSpecialChars(String word) {
        int count = 0;
        for(char ch = 'a'; ch <= 'z'; ch++) {
            String small = ch + "";
            String capital = Character.toUpperCase(ch) + "";
            if(word.contains(small) && word.contains(capital)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        System.out.println(numberOfSpecialChars(word));
    }
}