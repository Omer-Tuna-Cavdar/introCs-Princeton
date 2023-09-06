import java.lang.Math;
import java.util.Scanner;
public class SumOfSines {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter an angle in degrees: ");
        double angle1 = keyboard.nextDouble();
        double angle2 = keyboard.nextDouble();
        keyboard.close();
        double angle1Radians = Math.toRadians(angle1);
        double angle2Radians = Math.toRadians(angle2);
        double sum = Math.sin(angle1Radians) + Math.sin(angle2Radians);
        System.out.println("The sum of sines of " + angle1 + " and " + angle2 + " is " + sum);

    }
    
}
