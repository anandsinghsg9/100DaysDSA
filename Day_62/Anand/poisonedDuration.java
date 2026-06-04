package Anand;

public class poisonedDuration {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int output=0;
        int point=0;
        int locate=timeSeries[point]-1;
        while(point<timeSeries.length){
            if(locate>=timeSeries[point]){
                output=output-(locate-timeSeries[point]+1);
            }
            output=output+duration;
            locate=timeSeries[point]+duration-1;
            point++;
        }
        return output;
    }
    public static void main(String[] args) {
        poisonedDuration obj=new poisonedDuration();
        int[] timeSeries={1,4};
        int duration=2;
        System.out.println(obj.findPoisonedDuration(timeSeries, duration));
    }
}
