package Anand;

public class earliestFinish {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int output=Integer.MAX_VALUE;
        for(int i=0;i<landStartTime.length;i++){
            for(int j=0;j<waterStartTime.length;j++){
                int landFinish =landStartTime[i] + landDuration[i];

                int finish1 =Math.max(landFinish,waterStartTime[j])+ waterDuration[j];

                int waterFinish =waterStartTime[j] + waterDuration[j];

                int finish2 =Math.max(waterFinish,landStartTime[i])+ landDuration[i];

                output = Math.min(output,Math.min(finish1, finish2));
            }
        }
        return output;
    }
    public static void main(String[] args) {
        earliestFinish ef = new earliestFinish();
        int[] landStartTime = {1, 2, 3};
        int[] landDuration = {2, 3, 4};
        int[] waterStartTime = {2, 3, 4};
        int[] waterDuration = {3, 4, 5};

        int result = ef.earliestFinishTime(landStartTime, landDuration, waterStartTime, waterDuration);
        System.out.println("Earliest Finish Time: " + result);
    }
}
