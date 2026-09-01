package Day_93;

public class grumpyShopkeeper {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int left = 0;
        int right = minutes-1;
        int result=0;
        for(int i=0;i<customers.length;i++){
            if(i<=right){
                result+=customers[i];
            }
            else{
                if(grumpy[i]==0){
                    result+=customers[i];
                }
            }
        }
        left++;
        right++;
        int step=result;
        while(right<customers.length){
            if(grumpy[left-1]==1 && grumpy[right]==1){
                step=step-customers[left-1]+customers[right];
            }
            else if(grumpy[left-1]==0 && grumpy[right]==1){
                step=step+customers[right];
            }
            else if(grumpy[left-1]==1 && grumpy[right]==0){
                step=step-customers[left-1];
            }
            result=Math.max(step,result);
            left++;
            right++;
        }
        return result;
    }
    public static void main(String[] args) {
        grumpyShopkeeper obj=new grumpyShopkeeper();
        int customers[] = {1,0,1,2,1,1,7,5};int []grumpy = {0,1,0,1,0,1,0,1};int minutes = 3;
        System.out.println(obj.maxSatisfied(customers, grumpy, minutes));
    }
}
