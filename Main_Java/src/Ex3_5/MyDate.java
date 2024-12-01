package Ex3_5;

import java.util.Arrays;

public class MyDate {
    private int year;
    private int month;
    private int day;

    // Static variables
    public static final String[] MONTHS = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public static final String[] DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    public static final int[] DAYS_IN_MONTHS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    // Constructor
    public MyDate(int year, int month, int day) {
        setDate(year, month, day);
    }

    // Static methods
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (year < 1 || year > 9999 || month < 1 || month > 12) {
            return false;
        }
        int dayMax = DAYS_IN_MONTHS[month - 1];
        if (month == 2 && isLeapYear(year)) {
            dayMax = 29;
        }
        return day >= 1 && day <= dayMax;
    }

    public static int getDayOfWeek(int year, int month, int day) {
        // Zeller's Congruence Algorithm
        if (month < 3) {
            month += 12;
            year--;
        }
        int k = year % 100;
        int j = year / 100;
        return (day + 13 * (month + 1) / 5 + k + k / 4 + j / 4 - 2 * j) % 7;
    }

    // Public methods
    public void setDate(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            throw new IllegalArgumentException("Invalid year, month, or day!");
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setYear(int year) {
        if (year < 1 || year > 9999) {
            throw new IllegalArgumentException("Invalid year!");
        }
        this.year = year;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Invalid month!");
        }
        this.month = month;
    }

    public void setDay(int day) {
        if (!isValidDate(this.year, this.month, day)) {
            throw new IllegalArgumentException("Invalid day!");
        }
        this.day = day;
    }

    public int getYear() {
        return this.year;
    }

    public int getMonth() {
        return this.month;
    }

    public int getDay() {
        return this.day;
    }

    @Override
    public String toString() {
        int dayOfWeek = getDayOfWeek(year, month, day);
        return String.format("%s %d %s %d", DAYS[dayOfWeek], day, MONTHS[month - 1], year);
    }

    public MyDate nextDay() {
        if (isValidDate(year, month, day + 1)) {
            day++;
        } else if (month == 12) {
            day = 1;
            month = 1;
            year++;
        } else {
            day = 1;
            month++;
        }
        return this;
    }

    public MyDate nextMonth() {
        if (month == 12) {
            month = 1;
            year++;
        } else {
            month++;
        }
        day = Math.min(day, getDaysInMonth(year, month));
        return this;
    }

    public MyDate nextYear() {
        year++;
        if (!isValidDate(year, month, day)) {
            day = 28; // For Feb in a non-leap year
        }
        return this;
    }

    public MyDate previousDay() {
        if (day > 1) {
            day--;
        } else if (month == 1) {
            day = 31;
            month = 12;
            year--;
        } else {
            month--;
            day = getDaysInMonth(year, month);
        }
        return this;
    }

    public MyDate previousMonth() {
        if (month == 1) {
            month = 12;
            year--;
        } else {
            month--;
        }
        day = Math.min(day, getDaysInMonth(year, month));
        return this;
    }

    public MyDate previousYear() {
        year--;
        if (!isValidDate(year, month, day)) {
            day = 28;
        }
        return this;
    }

    private int getDaysInMonth(int year, int month) {
        int dayMax = DAYS_IN_MONTHS[month - 1];
        if (month == 2 && isLeapYear(year)) {
            dayMax = 29;
        }
        return dayMax;
    }
}
