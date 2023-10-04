import java.util.Scanner;
public class ISBN{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first 9 digits of an ISBN as an integer: ");
        int n = sc.nextInt();
        sc.close();

        int sum = 0;
        for (int i = 2; i <= 10; i++) {
            int digit = n % 10;                
            sum = sum + i * digit;
            n = n / 10;
        }

        System.out.print("The full ISBN number is " + n);
        if      (sum % 11 == 1) System.out.println("X");
        else if (sum % 11 == 0) System.out.println("0");
        else                    System.out.println(11 - (sum % 11));
    }
    }