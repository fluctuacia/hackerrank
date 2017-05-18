package algo.impl;

import java.util.Scanner;

/**
 * Created by fluctuacia on 5/14/17.
 */
public class TimeInWords {
    private static int MINUTES_IN_HOUR = 60;
    private static int MAX_HOURS = 12;

    private static String TWENTY = "twenty";
    private static String HALF = "half";
    private static String QUARTER = "quarter";

    private static String[] numbers = {
            "one", "two", "three", "four", "five",
            "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen",
            "sixteen", "seventeen", "eighteen", "nineteen", TWENTY };

    private static String getMinutesAsString(int m) {
        StringBuilder sb = new StringBuilder();

        if (m < 1 || m > MINUTES_IN_HOUR / 2) {
            throw new RuntimeException("Converts only minutes from 1 to 30");
        }

        if (m == MINUTES_IN_HOUR / 2) {
            return HALF;
        }

        if (m == MINUTES_IN_HOUR / 4) {
            return QUARTER;
        }

        if (m > 20 && m < 30) {
            sb.append(TWENTY).append(" ").append(numbers[m % 20 - 1]);
        } else {
            sb.append(numbers[m - 1]);
        }

        sb.append(" minute").append(m > 1 ? "s" : "");

        return sb.toString();
    }

    private static String getTimeAsString(int h, int m) {

        StringBuilder sb = new StringBuilder();

        if (m == 0) {
            sb.append(numbers[h - 1]).append(" o' clock");
        } else if (m <= 30){
            sb.append(getMinutesAsString(m)).append(" past ").append(numbers[h - 1]);
        } else if (m > 30) {
            int mTo = MINUTES_IN_HOUR - m;
            int hTo = h % MAX_HOURS;
            sb.append(getMinutesAsString(mTo)).append(" to ").append(numbers[hTo]);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int m = in.nextInt();

        if (h < 1 || h > MAX_HOURS) {
            throw new RuntimeException("1 <= H <= 12");
        }
        if (m < 0 || m >= MINUTES_IN_HOUR) {
            throw new RuntimeException("0 <= M < " + MINUTES_IN_HOUR);
        }

        System.out.println(getTimeAsString(h, m));
    }
}
