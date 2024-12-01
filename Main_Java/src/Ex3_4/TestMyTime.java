package Ex3_4;

public class TestMyTime {
    public static void main(String[] args) {
        // Test constructors
        MyTime time = new MyTime(23, 59, 59);
        System.out.println("Initial time: " + time);

        // Test nextSecond
        time.nextSecond();
        System.out.println("After nextSecond: " + time); // 00:00:00

        // Test previousSecond
        time.previousSecond();
        System.out.println("After previousSecond: " + time); // 23:59:59

        // Test nextMinute
        time.nextMinute();
        System.out.println("After nextMinute: " + time); // 00:00:59

        // Test previousMinute
        time.previousMinute();
        System.out.println("After previousMinute: " + time); // 23:59:59

        // Test nextHour
        time.nextHour();
        System.out.println("After nextHour: " + time); // 00:59:59

        // Test previousHour
        time.previousHour();
        System.out.println("After previousHour: " + time); // 23:59:59

        // Test setTime and setters
        time.setTime(12, 30, 45);
        System.out.println("After setTime(12, 30, 45): " + time);

        time.setHour(15);
        time.setMinute(45);
        time.setSecond(15);
        System.out.println("After setHour(15), setMinute(45), setSecond(15): " + time);

        // Test invalid input
        try {
            time.setTime(25, 60, 60);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
