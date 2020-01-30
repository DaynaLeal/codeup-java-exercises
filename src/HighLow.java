import java.util.Scanner;

public class HighLow {
    public static void main(){
        int randomNum = (int) Math.ceil(100 * java.lang.Math.random());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess a number between 1 and 100: ");
        int userInput = scanner.nextInt();

        if(userInput < randomNum){
            System.out.println("HIGHER: ");
            userInput = scanner.nextInt();
        } else if (userInput > randomNum){
            System.out.println("LOWER: ");
            userInput = scanner.nextInt();
        } else {
            System.out.println("GOOD GUESS!");
        }
    }
}
