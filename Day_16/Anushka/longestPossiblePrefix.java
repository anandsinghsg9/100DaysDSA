package Day_16.Anushka;

public class longestPossiblePrefix {
    public static void main(String[] args) {
       String[]words = { "flow" , "flower" , "float" , "flight" , "fly"};
       //treat the first string as the longest common substring
       //and compare this string with rest all strings
        // flow and flower = FLOW
        // flower and float = FLO
        //float and flight = FL
        //flight and abc = F  , ""
        ///time = 0(s) , space = 0(1)

        //1)edge case
        if(words == null || words.length == 0){
            System.out.println("");
        }
        //2) 1st string as the LCP
        String prefix = words[0];

        //3) compare our assumed LCP with whole strings
        for (int i = 1 ; i < words.length ; i++){

            //4)reduce string length from each comparisom
            while(words[i].indexOf(prefix) != 0){

                //5) reduce each ch by end
                prefix = prefix.substring(0 , prefix.length() - 1);

                //6) if prefix is empty(no common) no common prefix return empty substring
                if(prefix.isEmpty()){
                    System.out.println("");
                }
            }
            System.out.println(prefix+" ");
        }

    }
}
