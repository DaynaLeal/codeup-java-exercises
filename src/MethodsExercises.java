import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class MethodsExercises {
        public static void main(String[] args){
            System.out.println(addition(5, 7)); //12
            System.out.println(subtraction(5, 7)); //-2
            System.out.println(multiply(5, 7)); //35
            System.out.println(divide(10, 2));
            System.out.println(modulus(10, 2));
//            System.out.println(getInteger());
//            System.out.println(getInteger(1, 10));
            System.out.println(factorial()); //24

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

    //runthrough:
    //use "double" instead of long as the return type so that dividing by zero returns infinity

    //Bonus:


//-------------------------------------------------------------------------
    //2
    //Create a method that validates that user input is in a certain range
    //The method signature should look like this:
    //public static int getInteger(int min, int max);
    //and is used like this:
    //System.out.print("Enter a number between 1 and 10: ");
    //int userInput = getInteger(1, 10);

    public static int getInteger(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public static int getInteger(int min, int max){
        System.out.println("Enter a number between " + min + " and " + max + ": ");
        int userInput = getInteger();

        if (userInput < min || userInput > max){
            System.out.println("Please try again.");
            userInput = getInteger(min, max);
        }

        return userInput;
    }

    //runthrough
    public static int getInterger2(int min, int max){
            int answer;
            Scanner scan = new Scanner(System.in);
            do {
                System.out.println("Enter a number between " + min + " and " + max + ": ");
                answer = scan.nextInt();
            } while(answer < min || answer > max);
            return answer;
    }

    public static int getIntergerR(int min, int max){
            int answer;
            Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between " + min + " and " + max + ": ");
    }
//-------------------------------------------------------------------------

    //3 Calculate the factorial of a number.
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
      public static long factorial(){
//          System.out.println("Enter an integer between 1 and 10: ");
          Scanner scanner = new Scanner(System.in);
          int userInput = getInteger(1, 10);

          int output = 1;
          for(int i = 1; i <= userInput; i++){
              output *= i;
          }
          System.out.println(userInput + "! = " + output);

          System.out.println("Would you like to continue? [y/n]");
          String confirm = scanner.next();

          if(confirm.equals("y")){
              factorial();
          } else if (confirm.equals("n")){
              System.out.println("okay bye!");
          }

          return output;
      }

      //runthrough:
    public static void factorial2(){
            int base = getInteger(1, 10);
            long fact = 1;
            String output = "! = ";
        System.out.printf("1%s\n", output);

            for(int i = 1; i <= base; i++){
                fact *= i;
                output += " x " + i;
                System.out.printf("%d%s\n" + i + output);
            }
    }
//-------------------------------------------------------------------------

    //4 Create an application that simulates dice rolling.
        //Ask the user to enter the number of sides for a pair of dice.
        //Prompt the user to roll the dice.
        //"Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
        //Use static methods to implement the method(s) that generate the random numbers.
        //Use the .random method of the java.lang.Math class to generate random numbers.

//    public static void diceRoll(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("How many sides does this each die have?: ");
//        int numberSides =
int randoNum = (int)  Math.ceil(100 * java.lang.Math.random());
//    }

    public static int rollDice(){
            int dice1 = 0;
            int dice2 = 0;
            int numSides = 0;
            int total = (int)addition(dice1, dice2);

            Scanner scan = new Scanner(System.in);
            while(true){
                System.out.println("How many sides per die? (2 dice): ");
                numSides = getInteger(2,21);
                dice1 = (int) Math.round(Math.floor(Math.random() * numSides + 1));
                dice2 = (int) Math.round(Math.floor(Math.random() * numSides + 1));
                System.out.printf("%d + %d = %d\n", dice1, dice2, total);
                System.out.println("Would you like to roll again? [y/n]");
                String answer = scan.next();
                if(answer.equalsIgnoreCase("n")){
                    return total;
                }
            }
    }
//-------------------------------------------------------------------------




}
