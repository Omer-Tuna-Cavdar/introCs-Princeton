import java.util.Scanner;

public class Dragon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the order of the Dragon Curve: ");
        int order =  sc.nextInt();
        sc.close();
        String instructions = dragonCurve(order);
        System.out.println("Dragon Curve of Order " + order + " Instructions are: " + instructions);
        
    }
    public static String dragonCurve(int order) {
        if (order == 0) {
            return "F";
        } else {
            String previous = dragonCurve(order - 1);
            return previous + "L" + reverse(previous);
        }
    }
    public static String reverse(String s) {
        StringBuilder reversed = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == 'L') {
                reversed.append('R');
            } else if (c == 'R') {
                reversed.append('L');
            } else {
                reversed.append(c);
            }
        }
        return reversed.toString();
    }
}