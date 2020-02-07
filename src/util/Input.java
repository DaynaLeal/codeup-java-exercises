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

    public String getString(String prompt){
        System.out.println(prompt);
        String userString = this.scanner.next();
        return userString;
    }

    public boolean yesNo(String prompt){
        String answer;
        System.out.println(prompt);
        answer = this.scanner.next();
        return (answer.startsWith("y"));
    }

    public int getInt(int min, int max){
        System.out.println("Enter a number between " + min + " and " + max + ": ");
        int userInput = this.scanner.nextInt();

        if (userInput < min || userInput > max){
            System.out.println("Please try again. Enter a number between " + min + " and " + max + ": ");
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
            System.out.println("Please try again. Enter a number between " + min + " and " + max + ": ");
            userInput = getDouble(min, max);
        }
        return userInput;
    }

    public double getDouble(String prompt){
        System.out.println(prompt);
        double userInput = this.scanner.nextDouble();
        return userInput;
    }



}
