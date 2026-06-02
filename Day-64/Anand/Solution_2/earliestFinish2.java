package Anand.Solution_2;

public class earliestFinish2 {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int output=Integer.MAX_VALUE;
        for(int i=0;i<landStartTime.length;i++){
            for(int j=0;j<waterStartTime.length;j++){
                int step1=0;
                int step2=0;
                int stepfinal=0;
                if(landStartTime[i]<=waterStartTime[j]){
                    step1=landStartTime[i]+landDuration[i];
                    if(step1>=waterStartTime[j]){
                        step1=(step1-waterStartTime[j])+waterStartTime[j]+waterDuration[j];
                    }
                    else{
                        step1=waterStartTime[j]+waterDuration[j];
                    }
                }
                else if(landStartTime[i]>=waterStartTime[j]){
                    step2=waterStartTime[j]+waterDuration[j];
                    if(step2>=landStartTime[i]){
                        step2=(step2-landStartTime[i])+landStartTime[i]+landDuration[i];
                    }
                    else{
                        step2=landStartTime[i]+landDuration[i];
                    }
                }
                if(step1!=0 && step2!=0){
                    stepfinal=Math.min(step1,step2);
                }
                else if(step1!=0){
                    stepfinal=step1;
                }
                else{
                    stepfinal=step2;
                }
                output=Math.min(output,stepfinal);
            }
        }
        return output;
    }
    public static void main(String[] args) {
        earliestFinish2 ef = new earliestFinish2();
        int[] landStartTime = {1, 2, 3};
        int[] landDuration = {2, 3, 4};
        int[] waterStartTime = {2, 3, 4};
        int[] waterDuration = {3, 4, 5};

        int result = ef.earliestFinishTime(landStartTime, landDuration, waterStartTime, waterDuration);
        System.out.println("Earliest Finish Time: " + result);
    }
}
