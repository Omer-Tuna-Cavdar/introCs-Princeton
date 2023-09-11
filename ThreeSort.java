import java.util.Scanner;

public class ThreeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first number : ");
        int a = sc.nextInt();
        System.out.println("Please enter the second number : ");
        int b = sc.nextInt();
        System.out.println("Please enter the third number : ");
        int c = sc.nextInt();
        sc.close();
        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));
        int mid = a + b + c - min - max;
        System.out.println("The numbers in ascending order is : " + min + " " + mid + " " + max);
    }
}
