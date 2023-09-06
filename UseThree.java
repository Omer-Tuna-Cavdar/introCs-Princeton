import java.util.Scanner;
public class UseThree {
        public static void main(String[] args) {
        String [] names = new String[3];
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter three names: ");
        names[0] = keyboard.next();
        names[1] = keyboard.next();
        names[2] = keyboard.next();
        keyboard.close();
        System.out.print("Hi, " + names[0] + "," + names[1] + ", and " + names[2] + ".");
    }

}
