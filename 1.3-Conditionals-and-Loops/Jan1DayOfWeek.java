public class Jan1DayOfWeek {
    public static void main(String[] args) {
        int countSaturday = 0;
        int countSunday = 0;

        for (int year = 0; year < 400; year++) { // check for the interval of 400 years
            if (isSunday(year, 1, 1)) {
                countSunday++;
            } else if (isSaturday(year, 1, 1)) {
                countSaturday++;
            }
        }

        System.out.println("Number of times January 1 is on a Saturday: " + countSaturday);
        System.out.println("Number of times January 1 is on a Sunday: " + countSunday);

        if (countSunday > countSaturday) {
            System.out.println("Sunday is more likely.");
        } else if (countSaturday > countSunday) {
            System.out.println("Saturday is more likely.");
        } else {
            System.out.println("Both Saturday and Sunday have the same frequency.");
        }
    }

    // Check if a given year, month, and day is a Sunday
    private static boolean isSunday(int year, int month, int day) {
        int dayOfWeek = calculateDayOfWeek(year, month, day);
        return dayOfWeek == 0; // 0 represents Sunday
    }

    // Check if a given year, month, and day is a Saturday
    private static boolean isSaturday(int year, int month, int day) {
        int dayOfWeek = calculateDayOfWeek(year, month, day);
        return dayOfWeek == 6; // 6 represents Saturday
    }

    // Calculate the day of the week for a given year, month, and day using Zeller's Congruence
    private static int calculateDayOfWeek(int year, int month, int day) {
        if (month < 3) {
            month += 12;
            year--;
        }
        int k = year % 100;
        int j = year / 100;

        return (day + (13 * (month + 1)) / 5 + k + (k / 4) + (j / 4) - 2 * j) % 7;
    }
}
    
