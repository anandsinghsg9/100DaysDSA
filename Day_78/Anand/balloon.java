package Day_78.Anand;

public class balloon {
    public int maxNumberOfBalloons(String text) {
        java.util.HashMap<Character,Integer> map=new java.util.HashMap<>();
        int count=0;
        for(int i=0;i<text.length();i++){
            map.put(text.charAt(i),map.getOrDefault(text.charAt(i),0)+1);
        }
        while(map.containsKey('b') && map.get('b')>0){
            map.put('b',map.get('b')-1);
            if(map.containsKey('a') && map.get('a')>0){
                map.put('a',map.get('a')-1);
                if(map.containsKey('l') && map.get('l')>1){
                    map.put('l',map.get('l')-2);
                    if(map.containsKey('o') && map.get('o')>1){
                        map.put('o',map.get('o')-2);
                        if(map.containsKey('n') && map.get('n')>0){
                            map.put('n',map.get('n')-1);
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        balloon obj=new balloon();
        String text="loonbalxballpoon";
        System.out.println(obj.maxNumberOfBalloons(text));
    }
}
