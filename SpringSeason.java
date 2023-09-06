import java.util.Scanner;  


public class SpringSeason {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter month: ");
        int month = keyboard.nextInt();
        System.out.println("Enter day: ");
        int day = keyboard.nextInt();
        if(month == 3 && day >= 20 && day <= 31 || month == 4 && day >= 1 && day <= 30 || month == 5 && day >= 1 && day <= 31 || month == 6 && day >= 1 && day <= 20) {
            System.out.println("It's spring!");
        } else {
            System.out.println("It's not spring!");
        }
    }
}
