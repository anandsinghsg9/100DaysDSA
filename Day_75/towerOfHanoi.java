public class towerOfHanoi {
    public static void main(String[] args) {
        int n = 4;
        hanoi(4 , 'A' , 'B' , 'C');

    }
    private static void hanoi(int n , char source , char helper , char destination){
        if(n == 0){
            return;
        }
        hanoi(n - 1, source , destination , helper);
        System.out.println( source + " " + "to"+ " "+ destination);
        hanoi(n - 1, helper , source , destination);


    }
    
}
