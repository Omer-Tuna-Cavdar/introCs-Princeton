import java.util.Scanner;
public class Hurricane {
    public static void main(String[] args) {
        System.out.println("Please enter a wind speed: ");
        Scanner sc = new Scanner(System.in);
        int windSpeed = sc.nextInt();
        sc.close();
        if(windSpeed < 74) System.out.println("Not a hurricane.");
        else if(windSpeed < 96) System.out.println("Category 1.");
        else if(windSpeed < 110) System.out.println("Category 2.");
        else if(windSpeed < 130) System.out.println("Category 3.");
        else if(windSpeed < 155) System.out.println("Category 4.");
        else System.out.println("Category 5.");
    }
}
