public class RollLoadedDie {
        public static void main(String[] args) {
            int roll = (int) (Math.random() * 8) + 1;
            if (roll == 1) {
                System.out.println("You rolled a 1!");
            } else if (roll == 2) {
                System.out.println("You rolled a 2!");
            } else if (roll == 3) {
                System.out.println("You rolled a 3!");
            } else if (roll == 4) {
                System.out.println("You rolled a 4!");
            } else if (roll == 5) {
                System.out.println("You rolled a 5!");
            } else {
                System.out.println("You rolled a 6!");
            }
        }    
}
