package Day_16.Anushka;

public class longestCommonPrefix {
    public static void main(String[] args) {
        String [] strs = {"flow" , "flower" , "floy" , "flight"};
        if(strs == null || strs.length == 0) {
           System.out.println(" ");
        }
        String prefix = strs[0];
        for(int i = 1 ; i < strs.length; i++){
            while(!strs[i].startsWith(prefix)){
                prefix = prefix.substring(0 , prefix.length() - 1);
            }
            if(prefix.isEmpty()){
                System.out.println("");
                return;
            }
        }
        System.out.println(prefix+ " ");
    }
}
