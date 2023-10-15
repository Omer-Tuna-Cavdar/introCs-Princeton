import java.util.Scanner;
public class quarterbackRating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of completed passes: ");
        double A = sc.nextInt(); // This is the number of completed passes
        System.out.println("Please enter the number of pass attempts: ");
        double B = sc.nextInt(); // This is the number of pass attempts
        System.out.println("Please enter the number of passing yards: ");
        double C = sc.nextInt(); // This is the number of passing yards
        System.out.println("Please enter the number of touchdown passes: ");
        double D = sc.nextInt(); // This is the number of touchdown passes
        System.out.println("Please enter the number of interception : ");
        double E = sc.nextInt();  // This is the number of interceptions
        sc.close();
        double W =  250/3 * ((A/B)-0.3);
        double X =   25/6 * ((C / B) - 3);
        double Y =  1000/3 * (D / B);
        double Z = 1250/3 * (0.095 - (E / B));
        if (W < 0) W = 0; // This is to make sure that the rating is not negative
        if (X < 0) X = 0; // This is to make sure that the rating is not negative
        if (Y < 0) Y = 0; // This is to make sure that the rating is not negative
        if (Z < 0) Z = 0; // This is to make sure that the rating is not negative
        if (W > 475/12) W = 475/12; // This is to make sure that the rating is not greater than 475/12
        if (X > 475/12) X = 475/12; // This is to make sure that the rating is not greater than 475/12
        if (Y > 475/12) Y = 475/12; // This is to make sure that the rating is not greater than 475/12
        if (Z > 475/12) Z = 475/12; // This is to make sure that the rating is not greater than 475/12
        double QBR = (W + X + Y + Z); // This is the formula for the quarterback rating
        System.out.println("The quarterback rating is " + QBR);
    }
}
