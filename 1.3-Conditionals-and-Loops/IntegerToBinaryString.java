import java.util.Scanner;
public class IntegerToBinaryString {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        String s="";
        int power = 0;

        while (power <= n/2) {
            power *= 2;
        }
        while (power > 0) {
            if (n < power) {
                s+="0";
            } else {
                s+="1";
                n -= power;
            }
            power /= 2;
        }
        System.out.println(s);
 }    
}
