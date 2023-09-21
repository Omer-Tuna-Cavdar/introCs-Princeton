import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the temperature (in Fahrenheit between 0 and 50): ");
        double t=sc.nextDouble();
        System.out.println("Please enter the wind speed (in miles per hour between 3 and 120): ");
        double v=sc.nextDouble();
        sc.close();
        double w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
        System.out.println("Wind chill is  = " + w);    
    }
}
