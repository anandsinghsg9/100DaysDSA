public class towerOfHanoi {
    public static void main(String[] args) {
        int numberOfDisks = 4;
        hanoi(numberOfDisks , 'S'  ,  'D' , 'H');

    }
    private static void hanoi(int n , char sourceRod , char destinationRod , char helperRod){
        if(n == 0) return;
        hanoi(n - 1 ,sourceRod , helperRod , destinationRod);
        System.out.println("Move disk" + n + "from" + sourceRod + "to" + destinationRod + "via help of " +" " +  helperRod);

         hanoi(n - 1 , helperRod , destinationRod , helperRod );

    }
}
