package shapes;

public class Square extends Quadrilateral {
    public Square(int length) {
        super(length, length);
    }

    @Override
    public int getLength() {
        return this.length;
    }

    @Override
    public int getWidth() {
        return this.length;
    }

    @Override
    public void setLength() {
        this.length = length;
    }

    @Override
    public void setWidth() {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return length * 4;
    }

    @Override
    public double getArea() {
        return length * length;
    }

    //before Interfaces and Abstract Classes Exercise
    //coded inside public class Square extends Rectangle{} before changed for exercise
//    int side;
//
//    public Square(int side){
//        super(side, side);
//        this.side = side;
//    }
//
//    public int getArea(){
//        return side * side;
//    }
//
//    public int getPerimeter(){
//        return (4 * side);
//    }
}
