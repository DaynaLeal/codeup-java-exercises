public class javaPushups {
    public static void main(String[] args){
        System.out.println(multiply(7, 17)); //119
        System.out.println(toThePower(2, 10));
    }

    //write a method that multiplies two numbers without multiplying (use addition loop)
    public static int multiply(int a, int b){
        int sum = 0;
        for(int i = 0; i < b; i++){
            sum += a;
        }
        return sum;
    }
    //write a method that returns the power without using pow method
    public static long toThePower(int a, int b){
        int product = 1;
        for(int i = 0; i < b; i++){
            product *= a;
        }
        return product;
    }
}
