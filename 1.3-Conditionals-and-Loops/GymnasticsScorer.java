import java.util.Scanner;
public class GymnasticsScorer {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Please enter your scores: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        double e = scanner.nextDouble();
        double f = scanner.nextDouble();
        scanner.close();
        double max = Math.max(a, Math.max(b, Math.max(c, Math.max(d, Math.max(e, f)))));
        double min = Math.min(a, Math.min(b, Math.min(c, Math.min(d, Math.min(e, f)))));
        double sum = a + b + c + d + e + f;
        double score = (sum - max - min) / 4;
        System.out.println("The score is " + score);
    }
}
