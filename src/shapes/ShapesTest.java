package shapes;

public class ShapesTest {

    public static void main(String[] args) {
        Measurable myShape;

        //Interfaces and Abstract Classes
        myShape = new Square(5);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        myShape = new Rectangle(5, 4);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        //What happens if you try to call the getLength or getWidth methods of the myShape variable? Why?
//        myShape.getLength(); //these dont work because these methods are not declared in the Measurable interface. When a method is not included in an interface, it does not have that functionality!

        //before Interfaces and Abstract Classes Exercise
//        Rectangle box1 = new Rectangle(5,4);
//        Rectangle box2 = new Square(5);
//
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());
//
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());
    }
}
