package Day_23.Anand;

public class judgeCircle {
    public boolean judgeCircle(String moves) {
        int left=1;
        int right=-1;
        int up=-100;
        int down=100;
        int result=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='L'){
                result=result+left;
            }
            else if(moves.charAt(i)=='R'){
                result=result+right;
            }else if(moves.charAt(i)=='U'){
                result=result+up;
            }else{
                result=result+down;
            }
        }
        return result==0;    
    }
    public static void main(String[] args) {
        String moves = "UD";
        judgeCircle solution=new judgeCircle();
        System.out.println(solution.judgeCircle(moves));
    }
}
