public class Square extends Rectangle {
      private double side;

    public Square() {

    }

    public Square(double side) {
        this.side = side;
    }
    public Square(double side, String color, boolean filled) {
        super(side,side,color,filled);
        this.side = side;
    }
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double side) {
        this.side = side;
    }
    public void setHeight(double side) {
        this.side = side;
    }
    public String toString() {
        return "Square[Rectangle[Shape[color=" +color+",filled="+filled+",side="+side+"]]]";
    }
}