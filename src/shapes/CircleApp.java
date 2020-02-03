package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();

        do
        {double radius = input.getDouble("What is the radius of a circle?"); //fix this, needs to have prompt
        Circle circle = new Circle(radius);
        System.out.println(circle.getArea());
        System.out.println(circle.getCircumference());}
        while(input.yesNo("Do you want to make another?"));
        System.out.println(Circle.getCirclesCreated());
    }
}
