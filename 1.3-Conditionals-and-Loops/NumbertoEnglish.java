import java.util.Scanner;

public class NumbertoEnglish {
    private static final String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"}; // define all one digit numbers exept zero in order
    private static final String[] teens = {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"}; // define all two digit numbers between 11 and 19
    private static final String[] tens = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"}; // define all two digit multipliers of 10 between 10 and 90

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // get user input
        System.out.print("Enter an integer between -999,999,999 and 999,999,999: "); // prompt user for input
        int number = scanner.nextInt(); // store user input
        scanner.close() ; //close scanner

        if (number == 0) { // handle zero
            System.out.println("Zero");
        } 
        else if (number < 0) { // handle negative numbers
            System.out.print("Negative ");
            convertToEnglish(Math.abs(number));
        } 
        else { // handle positive numbers
            convertToEnglish(number);
        }
    }

    public static void convertToEnglish(int num) {
        if (num >= 1000000) { // if number is greater than or equal to 1 million
            convertToEnglish(num / 1000000); // call the method again with the number divided by 1 million
            System.out.print(" million"); // print million
            num %= 1000000; // get the remainder of the number divded by 1 million
            if (num > 0) { // if the remainder is greater than 0
                System.out.print(" ");// print a space to get ready for the string
            }
        }

        if (num >= 1000) { // if number is greater than or equal to 1 thousand
            convertToEnglish(num / 1000); // call the method again with the number divided by 1000
            System.out.print(" thousand"); // print thousand
            num %= 1000; // get the remainder of the number divded by 1000
            if (num > 0) { // if the remainder is greater than 0
                System.out.print(" "); // print a space to get ready for the string
            }
        }

        if (num >= 100) {
            System.out.print(ones[num / 100] + " hundred"); // print the number divided by 100
            num %= 100; // get the remainder of the number divided by 100
            if (num > 0) { // if the remainder is greater than 0
                System.out.print(" "); // print a space to get ready for the string
            }
        }

        if (num >= 20) {
            System.out.print(tens[num / 10]); // print the number as in the tens array
            num %= 10;// get the remainder of the number divided by 10
            if (num > 0) { // if the remainder is greater than 0
                System.out.print(" "); //print a space to get ready for the string
            }
        }

        if (num > 0) {
            if (num >= 11 && num <= 19) { // if the number is between 11 and 19
                System.out.print(teens[num - 10]); // print the number as english words in the teens array
            } 
            else {
                System.out.print(ones[num]); // print the number as english words in the ones array
            }
        }
    }
}
