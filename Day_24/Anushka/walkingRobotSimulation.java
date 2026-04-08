package Day_24.Anushka;
import java.util.HashSet;
public class walkingRobotSimulation {
    public static int robotSim(int[] commands, int[][] obstacles) {
        // store obstacles
        HashSet<String> set = new HashSet<>();
        for (int[] o : obstacles) {
            set.add(o[0] + "_" + o[1]);
        }

        int x = 0, y = 0;
        int max = 0;

        // start facing North
        int dx = 0, dy = 1;

        for (int command : commands) {

            if (command == -2) { // turn left
                int temp = dx;
                dx = -dy;
                dy = temp;
            } 
            else if (command == -1) { // turn right
                int temp = dx;
                dx = dy;
                dy = -temp;
            } 
            else {
                for (int i = 0; i < command; i++) {
                    int newX = x + dx;
                    int newY = y + dy;

                    if (set.contains(newX + "_" + newY)) break;

                    x = newX;
                    y = newY;

                    max = Math.max(max, x*x + y*y);
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[] commands = {4, -1, 4, -2, 4};
        int[][] obstacles = {{2, 4}};

        int result = robotSim(commands, obstacles);

        System.out.println(result);
    }
}