import java.util.Scanner;
public class MakingChange {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the amount of pennies you have: ");
        int pennies = sc.nextInt();
        sc.close();
        int quarters = pennies / 25;
        pennies %= 25;
        int dimes = pennies / 10;
        pennies %= 10;
        System.out.println("You have " + quarters + " quarters, " + dimes + " dimes, and " + pennies + " pennies.");
        }
}