package Ex4_2;

public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    // Constructor
    public Student(String name, String address, String program, int year, double fee) {
        super(name, address); // Call superclass constructor
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    // Getters
    public String getProgram() {
        return program;
    }

    public int getYear() {
        return year;
    }

    public double getFee() {
        return fee;
    }

    // Setters
    public void setProgram(String program) {
        this.program = program;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    // Override toString
    @Override
    public String toString() {
        return "Student[" + super.toString()
                + ", program=" + program
                + ", year=" + year
                + ", fee=" + fee + "]";
    }
}

