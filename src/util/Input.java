package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        //my attempt
        System.out.println("Enter a string");
//        scanner = new Scanner(System.in);
        String userString = this.scanner.next();
//        return userString;
        //runthrough
        return userString;
    }
    public boolean yesNo(){
        System.out.println("yes or no?");
        scanner = new Scanner(System.in);
        String userAnswer = scanner.next();
        if (userAnswer.equalsIgnoreCase("yes") || userAnswer.equalsIgnoreCase("y"))
        return true; else {return false;}
    }
    public int getInt(int min, int max){
        System.out.println("Enter a number between " + min + " and " + max + ": ");
        int userInput = this.scanner.nextInt();

        if (userInput < min || userInput > max){
            System.out.println("Please try again.");
            userInput = getInt(min, max);
        }
        return userInput;
    }

    public int getInt(){
        System.out.println("Enter a number: ");
        int userInput = this.scanner.nextInt();
        return userInput;
    }

    public double getDouble(double min, double max){
        System.out.println("Enter a number between " + min + " and " + max + ": ");
        double userInput = this.scanner.nextDouble();

        if (userInput < min || userInput > max){
            System.out.println("Please try again.");
            userInput = getDouble(min, max);
        }
        return userInput;
    }

    public double getDouble(){
        System.out.println("Enter a number: ");
        double userInput = this.scanner.nextDouble();
        return userInput;
    }


}
