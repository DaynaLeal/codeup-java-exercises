import java.util.Scanner;

public class MethodsExercises {
        public static void main(String[] args){
            System.out.println(addition(5, 7)); //12
            System.out.println(subtraction(5, 7)); //-2
            System.out.println(multiply(5, 7)); //35
            System.out.println(divide(10, 2));
            System.out.println(modulus(10, 2));

        }

    //1a basic arithmetic
    //Create four separate methods. Each will perform an arithmetic operation:
    //Addition
    public static int addition(int a, int b){
            return a + b;
    }
    //Subtraction
    public static int subtraction(int a, int b){
            return a - b;
    }
    //Multiplication
    public static long multiply(int a, int b){
            return a * b;
    }
    //Division
    public static long divide(int a, int b){
            return a / b;
    }
    //modulus
    public static long modulus(int a, int b){
            return a % b;
    }


//-------------------------------------------------------------------------
    //2
    //Create a method that validates that user input is in a certain range
    //The method signature should look like this:
    //public static int getInteger(int min, int max);
    //and is used like this:
    //System.out.print("Enter a number between 1 and 10: ");
    //int userInput = getInteger(1, 10);
//    public static int getInteger(int min, int max){
//        Scanner scanner = new Scanner(System.in);
//        int userInput = scanner.nextInt();
//
//        if(userInput < min){
//            System.out.println("Enter a number between 1 and 10: ");
//            int userInput2 = scanner.nextInt();
//        } else if (userInput > max){
//
//        }
//    }

//-------------------------------------------------------------------------

    //3
//    Calculate the factorial of a number.
//
//    Prompt the user to enter an integer from 1 to 10.
//    Display the factorial of the number entered by the user.
//    Ask if the user wants to continue.
//    Use a for loop to calculate the factorial.
//    Assume that the user will enter an integer, but verify it’s between 1 and 10.
//    Use the long type to store the factorial.
//    Continue only if the user agrees to.
//    A factorial is a number multiplied by each of the numbers before it.
//    Factorials are denoted by the exclamation point (n!). Ex:
//        1! = 1               = 1
//        2! = 1 x 2           = 2
//        3! = 1 x 2 x 3       = 6
//        4! = 1 x 2 x 3 x 4   = 24
      public static void factorial(String[] args){
          Scanner scanner = new Scanner(System.in);
          System.out.println("Enter an integer from 1 to 10: ");
          int userInput = scanner.nextInt();

      }

}
