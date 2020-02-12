package java2Review;

public class TestCalcClass {

    public static void main(String[] args) {
        double x = 15;
        double y = 31;
        int z = 0;

        System.out.println(RealCalc.add(x, y));
//        System.out.println(Calc.subtract(x, y)); //these two are using int x and int y since call Calc instead of Realcalc
//        System.out.println(Calc.multiply(x, y));
        System.out.println(RealCalc.divide(x, 0));
    }

}
