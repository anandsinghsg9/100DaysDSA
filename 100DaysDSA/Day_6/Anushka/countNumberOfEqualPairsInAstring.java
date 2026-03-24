package Day_6.Anushka;
public class countNumberOfEqualPairsInAstring {
    public static void main(String[] args) {
        String s = "aa";
        int[]frequency = new int[26];
        for(char ch : s.toCharArray()){
            frequency[ch - 'a']++;
        }
        long result = 0;
        for (int f : frequency){
            result += (long) f * f;
        }
        System.out.println("Total equal pairs : " + result);
    }
}
