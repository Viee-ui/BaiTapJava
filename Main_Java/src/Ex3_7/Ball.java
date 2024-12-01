package Ex3_7;

public class Ball {
    private float x, y;
    private float xDelta, yDelta;

    public Ball(float x, float y) {
        this.x = x;
        this.y = y;
        this.xDelta = 0;
        this.yDelta = 0;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setPosition(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void setMovement(float xDelta, float yDelta) {
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }

    public void move() {
        x += xDelta;
        y += yDelta;
    }

    @Override
    public String toString() {
        return String.format("Ball at (%.2f, %.2f)", x, y);
    }
}

