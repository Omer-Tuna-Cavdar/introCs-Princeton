import java.util.Scanner;

public class X {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int n = Scanner.nextInt(); // read the user input
        Scanner.close();
        for (int i = -n; i <= n; i++) { // loop n times, one for each collum
            for (int j = -n; j <= n; j++) { // loop n times, one for each row
                if ((i == -j) || (i == j)) { 
                    System.out.print("* "); // print a star
                }
                else {
                    System.out.print(". "); // print a period
            }
        }
            System.out.println();
        }
    }
}
