package movies;
import java.util.Scanner;

public class MoviesApplication {
//hung said to create methods for all the case statements
    //create if statements
    //do not use recursion
    public static void main(String[] args){
        MoviesArray movieCall = new MoviesArray();
        movieCall.findAll();
        caseOne(movieCall);


        System.out.println("What would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the sci-fi category\n" +
                "\n" +
                "Enter your choice: ");

        chooseMovies();
    }

    public static void caseOne(MoviesArray movieCall){
        for(Movie movie : movieCall.findAll()){
            System.out.printf("%s --- %s\n", movie.getName(), movie.getCategory());
        }
    }



    public static void chooseMovies(){

        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();

        switch (userChoice) {
            case 0:
                // Exit program function
                System.out.println("You chose to exit.");
                break;
            case 1:
                // Display all movie function
                System.out.println("You chose to view all movies.");

                System.out.println("\n" + "Would you like to view another category? [y/n]");
                String answer = scanner.next();
                if(answer.equalsIgnoreCase("n")){
                    break;
                } else {
                    chooseMovies();
                }
                break;
            case 2:
                System.out.println("You chose to view movies in the animated category.");

                System.out.println("\n" + "Would you like to view another category? [y/n]");
                String answer2 = scanner.next();
                if(answer2.equalsIgnoreCase("n")){
                    break;
                } else {
                    chooseMovies();
                }
                break;
            case 3:
                System.out.println("You chose to view movies in the drama category.");

                System.out.println("\n" + "Would you like to view another category? [y/n]");
                String answer3 = scanner.next();
                if(answer3.equalsIgnoreCase("n")){
                    break;
                } else {
                    chooseMovies();
                }
                break;
            case 4:
                System.out.println("You chose to view movies in the horror category.");

                System.out.println("\n" + "Would you like to view another category? [y/n]");
                String answer4 = scanner.next();
                if(answer4.equalsIgnoreCase("n")){
                    break;
                } else {
                    chooseMovies();
                }
                break;
            case 5:
                System.out.println("You chose to view movies in the sci-fi category.");

                System.out.println("\n" + "Would you like to view another category? [y/n]");
                String answer5 = scanner.next();
                if(answer5.equalsIgnoreCase("n")){
                    break;
                } else {
                    chooseMovies();
                }
                break;
            default:
                System.out.println("You did not choose a category...");

                System.out.println("\n" + "Would you like to view a category? [y/n]");
                String answerDefault = scanner.next();
                if(answerDefault.equalsIgnoreCase("n")){
                    break;
                } else {
                    chooseMovies();
                }
                break;
        }
    }
}
