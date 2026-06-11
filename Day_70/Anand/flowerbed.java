package Day_70.Anand;

public class flowerbed {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int left=0;
        int point=1;
        int right=2;
        if(flowerbed.length==0){
            return n==0;
        }
        if(flowerbed.length==1){
            if(flowerbed[left]==0 && n!=0){
                n--;
                flowerbed[left]=1;
            }
            return n==0;
        }
        if(flowerbed[left]==0 && flowerbed[point]==0 && n!=0){
            n--;
            flowerbed[left]=1;
        }
        while(n!=0 && right<flowerbed.length){
            if(flowerbed[left]==0 && flowerbed[right]==0 && flowerbed[point]==0){
                n--;
                flowerbed[point]=1;
            }
            point++;
            left++;
            right++;
        }
        if(flowerbed[left]==0 && flowerbed[point]==0 & n!=0){
            n--;
            flowerbed[left]=1;
        }
        return n==0;
    }
    public static void main(String[] args) {
        flowerbed obj=new flowerbed();
        int[] flowerbed={1,0,0,0,1};
        int n=1;
        System.out.println(obj.canPlaceFlowers(flowerbed, n));
    }
}
