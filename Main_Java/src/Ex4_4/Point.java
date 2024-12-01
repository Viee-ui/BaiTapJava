package Ex4_4;

public class Point {
    private float x;
    private float y;

    // Default constructor (sets x and y to 0)
    public Point() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    // Constructor with specified x and y values
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Getter for x
    public float getX() {
        return x;
    }

    // Setter for x
    public void setX(float x) {
        this.x = x;
    }

    // Getter for y
    public float getY() {
        return y;
    }

    // Setter for y
    public void setY(float y) {
        this.y = y;
    }

    // Override toString to display the coordinates of the point
    @Override
    public String toString() {
        return "Point[x=" + x + ", y=" + y + "]";
    }
}
