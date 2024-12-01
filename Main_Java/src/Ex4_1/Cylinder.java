package Ex4_1;

public class Cylinder extends Circle {
    private double height; // Private instance variable

    // Constructors
    public Cylinder() {
        super();       // Call Circle's no-arg constructor
        this.height = 1.0;
    }

    public Cylinder(double height) {
        super();       // Call Circle's no-arg constructor
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius); // Call Circle's constructor with radius
        this.height = height;
    }

    // Getter for height
    public double getHeight() {
        return height;
    }

    // Setter for height
    public void setHeight(double height) {
        this.height = height;
    }

    // Override getArea() to calculate surface area of the cylinder
    @Override
    public double getArea() {
        double baseArea = super.getArea(); // Circle's area
        double sideArea = 2 * Math.PI * getRadius() * height;
        return 2 * baseArea + sideArea;
    }

    // Fix getVolume() to use Circle's getArea()
    public double getVolume() {
        return super.getArea() * height; // Use base area from Circle
    }

    // Override toString()
    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString() + " height=" + height;
    }
}

