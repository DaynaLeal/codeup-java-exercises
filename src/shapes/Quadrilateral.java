package shapes;

abstract class Quadrilateral extends Shape implements Measurable {
    protected int length;
    protected int width;

    public Quadrilateral(int length, int width){
        this.length = length;
        this.width = width;
    }

    public abstract int getLength();
    public abstract int getWidth();

    public abstract void setLength();
    public abstract void setWidth();
}
