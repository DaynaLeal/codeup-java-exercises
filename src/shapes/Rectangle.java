package shapes;

public class Rectangle extends Quadrilateral implements Measurable{
    //Interfaces and Abstract Classes Exercise
    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    public int getLength() {
        return this.length;
    }

    @Override
    public int getWidth() {
        return this.width;
    }

    @Override
    public void setLength() {
        this.length = length;
    }

    @Override
    public void setWidth() {
        this.width = width;
    }

    //Why does the code fail to compile if you leave off the getPerimeter method in Rectangle?
    //if this is commented out then this class pops an error because each of these methods must be overridden since they are declared as abstract methods in the Quadrilateral (parent)
    @Override
    public double getPerimeter() {
        return (length * 2) + (width * 2);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    //Before Interfaces and Abstract Classes Exercises
    //coded within public class Rectangle {} before changed
//    protected int length;
//    protected int width;
//
//    //constructor
//    public Rectangle(int length, int width){
//        this.length = length;
//        this.width = width;
//    }
//
//    public int getArea(){
//        return length * width;
//    }
//
//    public int getPerimeter(){
//        return (2 * length) + (2 * width);
//    }

}
