//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Shape shape = new Shape("red", true);
        Circle circle = new Circle(1.0, "Red", true);
        Rectangle rectangle = new Rectangle(5, 6, "Blue", true);
        Square square = new Square(1.0, "Blue", true);

        System.out.println(shape);

        System.out.println(circle);

        System.out.println(rectangle);

        System.out.println(square);


    }
}