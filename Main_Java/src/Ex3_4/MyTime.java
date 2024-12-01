package Ex3_4;

public class MyTime {
    private int hour;
    private int minute;
    private int second;

    // Constructor
    public MyTime(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    // Set time with validation
    public void setTime(int hour, int minute, int second) {
        if (isValidHour(hour) && isValidMinuteOrSecond(minute) && isValidMinuteOrSecond(second)) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        } else {
            throw new IllegalArgumentException("Invalid hour, minute, or second!");
        }
    }

    // Individual setters with validation
    public void setHour(int hour) {
        if (isValidHour(hour)) {
            this.hour = hour;
        } else {
            throw new IllegalArgumentException("Invalid hour!");
        }
    }

    public void setMinute(int minute) {
        if (isValidMinuteOrSecond(minute)) {
            this.minute = minute;
        } else {
            throw new IllegalArgumentException("Invalid minute!");
        }
    }

    public void setSecond(int second) {
        if (isValidMinuteOrSecond(second)) {
            this.second = second;
        } else {
            throw new IllegalArgumentException("Invalid second!");
        }
    }

    // Getters
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    // toString
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    // Next and previous second
    public MyTime nextSecond() {
        if (++second == 60) {
            second = 0;
            nextMinute();
        }
        return this;
    }

    public MyTime previousSecond() {
        if (--second < 0) {
            second = 59;
            previousMinute();
        }
        return this;
    }

    // Next and previous minute
    public MyTime nextMinute() {
        if (++minute == 60) {
            minute = 0;
            nextHour();
        }
        return this;
    }

    public MyTime previousMinute() {
        if (--minute < 0) {
            minute = 59;
            previousHour();
        }
        return this;
    }

    // Next and previous hour
    public MyTime nextHour() {
        hour = (hour + 1) % 24;
        return this;
    }

    public MyTime previousHour() {
        hour = (hour - 1 + 24) % 24;
        return this;
    }

    // Helper methods for validation
    private boolean isValidHour(int hour) {
        return hour >= 0 && hour < 24;
    }

    private boolean isValidMinuteOrSecond(int value) {
        return value >= 0 && value < 60;
    }
}

