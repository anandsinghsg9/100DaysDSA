import java.util.HashSet;

public class longestCommonPrefix {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet <Integer> set=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            int num=arr1[i];
            while(num>0){
                set.add(num);
                num=num/10;
            }
        }
        int count =0;
        for(int i=0;i<arr2.length;i++){
            int num=arr2[i];
            int step=0;
            while(num>0){
                if(set.contains(num)){
                    step++;
                }
                num=num/10;
            }
            count=Math.max(step,count);
        }
        return count;
    }
    public static void main(String[] args) {
        longestCommonPrefix lcp=new longestCommonPrefix();
        int[] arr1={123,456,789};
        int[] arr2={12,45,78};
        int result=lcp.longestCommonPrefix(arr1,arr2);
        System.out.println(result);
    }
}
