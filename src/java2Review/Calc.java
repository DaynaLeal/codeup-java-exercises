package java2Review;

public class Calc {

    public static int add(int num1, int num2){
        return num1 + num2;
    }
    public static int subtract(int num1, int num2){
        return num1 - num2;
    }
    public static int multiply(int num1, int num2){
        return num1 * num2;
    }
    public static int divide(int num1, int num2){
        try{
            return num1 / num2;
        } catch (ArithmeticException ae){
            System.out.println("cannot divide by zero, so we gave you zero: ");
            return 0;
        }

    }
}
