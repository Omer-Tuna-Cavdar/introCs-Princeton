import java.lang.Math;
import java.util.Scanner;
public class Distance {
    public static void main(String[] args) {
        double[] position = new double[2];
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the x and y coordinates of a point: ");
        position[0] = keyboard.nextInt();
        position[1] = keyboard.nextInt();
        keyboard.close();
        double x = (position[0]);
        double y = (position[1]);
        double distance = Math.sqrt(x*x + y*y);
        System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + distance);
    }
    
}
