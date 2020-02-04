package shapes;

public class ShapesTest {

    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5,4);
        Rectangle box2 = new Square(5);

        System.out.println(box1.getPerimeter(5, 4));
        System.out.println(box1.getArea(5, 4));

        System.out.println(box2.getPerimeter(5, 5));
        System.out.println(box2.getArea(5, 5));

    }
}
