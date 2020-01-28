import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){

        //exercise 1
        double pi = 3.14159;
        System.out.printf("\nThe value of pi is approximately %f\n", pi);

        //exercise 2
        Scanner scanner = new Scanner(System.in);

        //2.1
//        System.out.print("Enter an integer: ");
//        int userInt = scanner.nextInt();
//        System.out.println("You entered: --> \"" + userInt + "\" <--");

        //2.2
//        System.out.print("Enter 3 words: ");
//        String userInput1 = scanner.next();
//        String userInput2 = scanner.next();
//        String userInput3 = scanner.next();
//        System.out.println("You entered: --> \"" + userInput1 + "\n" + userInput2 + "\n" + userInput3 + "\" <--");
        //if you enter more than three then only 3 are returned
        //if you enter less than three then it doesnt run until you add another word
        //integers work though

        //2.3
//        System.out.print("Enter a sentence: ");
//        String userSentence = scanner.nextLine();
//        System.out.println("You entered: \"" + userSentence + "\"");

        //exercise 3
        System.out.print("Enter two integers representing the length and width of a Codeup classroom: ");
        String userInput1 = scanner.nextLine();
        String userInput2 = scanner.nextLine();
//        int area = userInput1 *= userInput2;
        System.out.println();











    }
}
