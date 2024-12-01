package Ex4_3;


public class Point2D {
    private float x;
    private float y;

    // Constructor with default values
    public Point2D() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    // Constructor with specified values
    public Point2D(float x, float y) {
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

    // Method to get the 2D coordinates as an array
    public float[] getXY() {
        float[] result = new float[2];  // create an array of 2 elements
        result[0] = x;
        result[1] = y;
        return result;  // return the array
    }

    // Override toString to display coordinates
    @Override
    public String toString() {
        return "Point2D[x=" + x + ", y=" + y + "]";
    }
}
