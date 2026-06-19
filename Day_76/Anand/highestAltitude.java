package Day_76.Anand;

public class highestAltitude {
    public int largestAltitude(int[] gain) {
        int len=gain.length;
        int []prefix=new int[len+1];
        prefix[0]=0;
        int max=prefix[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+gain[i-1];
            max=Math.max(max,prefix[i]);
        }
        return max;
    }
    public static void main(String[] args) {
        highestAltitude obj=new highestAltitude();
        int []gain={-5,1,5,0,-7};
        System.out.println(obj.largestAltitude(gain));
    }
}
