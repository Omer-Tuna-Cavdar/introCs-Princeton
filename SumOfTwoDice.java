public class SumOfTwoDice {
    public static void main(String[] args) {
        int dice1 = (int) (Math.random() * 6) + 1;
        int dice2 = (int) (Math.random() * 6) + 1;
        int sum = dice1 + dice2;
        System.out.println("The first dice " + dice1);
        System.out.println("The second dice " + dice2);
        System.out.println("The sum of two dice " + sum);
    }
    
}
