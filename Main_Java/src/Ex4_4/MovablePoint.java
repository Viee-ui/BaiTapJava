package Ex4_4;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    // Default constructor (sets x, y, xSpeed, and ySpeed to 0)
    public MovablePoint() {
        super();  // Calls the constructor of Point to set default x and y
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
    }

    // Constructor with specified x, y, xSpeed, and ySpeed values
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);  // Calls the constructor of Point to set x and y
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Getter for xSpeed
    public float getXSpeed() {
        return xSpeed;
    }

    // Setter for xSpeed
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    // Getter for ySpeed
    public float getYSpeed() {
        return ySpeed;
    }

    // Setter for ySpeed
    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    // Method to move the point by adding the speed to the current position
    public void move() {
        setX(getX() + xSpeed);  // Move x by xSpeed
        setY(getY() + ySpeed);  // Move y by ySpeed
    }

    // Override toString to display both the coordinates and the speed
    @Override
    public String toString() {
        return "MovablePoint[" + super.toString() + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + "]";
    }
}
