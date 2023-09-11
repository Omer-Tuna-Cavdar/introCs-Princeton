import java.util.Scanner;

public class CartesianToPolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the x coordinate: ");
        double x = sc.nextDouble();
        System.out.println("Please enter the y coordinate: ");
        double y = sc.nextDouble();
        sc.close();
        
        double r = Math.sqrt(x*x + y*y);
        double theta = Math.atan2(y, x);
        theta = theta * 180 / Math.PI;
        
        System.out.println("r     = " + r);
        System.out.println("theta = " + theta);
    }
}
