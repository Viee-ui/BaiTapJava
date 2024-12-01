package Ex4_3;

public class Point3D extends Point2D {
    private float z;

    // Constructor with default values (calls superclass constructor)
    public Point3D() {
        super();  // Call the constructor of Point2D
        this.z = 0.0f;
    }

    // Constructor with specified x, y, and z values
    public Point3D(float x, float y, float z) {
        super(x, y);  // Call the constructor of Point2D
        this.z = z;
    }

    // Getter for z
    public float getZ() {
        return z;
    }

    // Setter for z
    public void setZ(float z) {
        this.z = z;
    }

    // Override getXY to return both x and y from Point2D and add z to it
    @Override
    public float[] getXY() {
        float[] result = super.getXY();  // Get the 2D array from Point2D
        result[0] = getX();  // x coordinate
        result[1] = getY();  // y coordinate
        return result;  // Return the 2D array
    }

    // Method to set the 3D coordinates (x, y, z)
    public void setXYZ(float x, float y, float z) {
        setX(x);  // Set x coordinate using the superclass setter
        setY(y);  // Set y coordinate using the superclass setter
        this.z = z;  // Set z coordinate for the Point3D class
    }

    // Override toString to display x, y, and z coordinates
    @Override
    public String toString() {
        return "Point3D[" + super.toString() + ", z=" + z + "]";
    }
}

