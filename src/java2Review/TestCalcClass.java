package java2Review;

public class TestCalcClass {

    public static void main(String[] args) {
        int x = 15;
        int y = 31;
        int z = 0;

        System.out.println(Calc.add(x, y));
        System.out.println(Calc.subtract(x, y));
        System.out.println(Calc.multiply(x, y));
        System.out.println(Calc.divide(x, 0));
    }

}
