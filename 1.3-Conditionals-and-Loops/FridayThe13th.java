public class FridayThe13th {
    public static void main(String[] args) {
        int maxConsecutiveDays = 0;
        int currentConsecutiveDays = 0;

        for (int year = 0; year < 400; year++) {
            for (int month = 1; month <= 12; month++) {
                if (isFridayThe13th(year, month)) {
                    currentConsecutiveDays = 0; // Reset consecutive days
                }
                else {
                    currentConsecutiveDays++;
                    if (currentConsecutiveDays > maxConsecutiveDays) {
                        maxConsecutiveDays = currentConsecutiveDays;
                    }
                }
            }
        }

        System.out.println("Maximum consecutive days without a Friday the 13th in a 400-year interval: " + maxConsecutiveDays);
    }

    // Check if a given year and month has a Friday the 13th
    private static boolean isFridayThe13th(int year, int month) {
        // The day of the week for any date can be determined using the Zeller's Congruence algorithm
        if (month < 3) {
            month += 12;
            year--;
        }
        int k = year % 100;
        int j = year / 100;

        int dayOfWeek = (1 + (13 * (month + 1)) / 5 + k + (k / 4) + (j / 4) - 2 * j) % 7;

        return dayOfWeek == 5; // 5 represents Friday
    }
}
