package shapes;

public class Circle {

    private double radius;
    private static int circlesCreated = 0;

    public Circle(double radius){
        this.radius = radius;
        circlesCreated++;
    }

    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }

    public double getCircumference(){
        return this.radius * 2 * Math.PI;
    }

    public static int getCirclesCreated(){
        return circlesCreated;
    }
}
