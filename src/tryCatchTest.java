
public class tryCatchTest {

    public static void main(String[] args) {

        try{
            System.out.println("*before likely exception*");
            int test = 10 / 0;
            System.out.println(test);
        } catch (ArithmeticException e){
            System.out.println("*this will print instead of our test result if an exception was caught*");
        }
    }
}
