import java.util.Scanner;
public class GymnasticsScorer {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Please enter your scores: ");
        double a = scanner.nextDouble(); // take the first judge's score
        double b = scanner.nextDouble(); // take the second judge's score
        double c = scanner.nextDouble(); // take the third judge's score
        double d = scanner.nextDouble(); // take the fourth judge's score
        double e = scanner.nextDouble(); // take the fifth judge's score
        double f = scanner.nextDouble(); // take the sixth judge's score
        scanner.close();
        double max = Math.max(a, Math.max(b, Math.max(c, Math.max(d, Math.max(e, f))))); // find the max of the six scores
        double min = Math.min(a, Math.min(b, Math.min(c, Math.min(d, Math.min(e, f))))); // find the min of the six scores
        double sum = a + b + c + d + e + f; // find the sum of the six scores
        double score = (sum - max - min) / 4; // find the average of the four middle scores
        System.out.println("The score is " + score); // print the score
    }
}
