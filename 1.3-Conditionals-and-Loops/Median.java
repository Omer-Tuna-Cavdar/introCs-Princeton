import java.util.Scanner;

public class Median{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter five integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        sc.close();
        int median;
        int max = Math.max(a, Math.max(b, Math.max(c, Math.max(d, e))));
        int min = Math.min(a, Math.min(b, Math.min(c, Math.min(d, e))));
        int sum = a + b + c + d + e;
        median = (sum - max - min) / 3;
        System.out.println("The median is " + median);
    }
}
