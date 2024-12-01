package Ex3_7;

public class Player {
    private String name;
    private float x, y;
    private float speed;

    public Player(String name, float x, float y, float speed) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void move(float xDirection, float yDirection) {
        x += xDirection * speed;
        y += yDirection * speed;
    }

    public void kick(Ball ball, float xTarget, float yTarget) {
        float xDelta = xTarget - ball.getX();
        float yDelta = yTarget - ball.getY();
        float magnitude = (float) Math.sqrt(xDelta * xDelta + yDelta * yDelta);
        ball.setMovement(xDelta / magnitude * speed, yDelta / magnitude * speed);
    }

    @Override
    public String toString() {
        return String.format("Player %s at (%.2f, %.2f)", name, x, y);
    }
}

