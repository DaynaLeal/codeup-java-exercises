import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args){

        //1a Create a while loop that runs so long as i is less than or equal to 15
        //Each loop iteration, output the current value of i, then increment i by one.
        //Your output should look like this:
        //5 6 7 8 9 10 11 12 13 14 15
//        int i = 5;
//        while(i <= 15){
//            System.out.println(i);
//            i++;
//        }


//---------------------------------------------

        //1b Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        int i = 0;
//        do{
//            if (i % 2 == 0){
//                System.out.println(i);
//                i++;
//            } else {
//                i++;
//            }
//        } while(i <= 100);



        //Alter your loop to count backwards by 5's from 100 to -10.
//        int i =100;
//        do{
//            if (i % 5 == 0){
//                System.out.println(i);
//                i--;
//            } else {
//                i--;
//            }
//        } while(i >= -10);



        //Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
        // 2
        // 4
        // 16
        // 256
        // 65536
//        long i = 2;
//        do{
//            i *= i;
//            System.out.println(i);
//        } while(i < 65536);

//-----------------------------------------------------------------------------
        //1c Refactor the previous two exercises to use a for loop instead.
//        for (long i = 100; i > -10; i -=5){
//            System.out.println(i);
//        }


//        for(long i = 2; i < 1000000; i *= i){
//            System.out.println(i);
//        }

//------------------------------------------------------------------------------
        //2 Fizzbuzz
//        for(long i = 0; i <= 100; i++){
//            if(i % 15 == 0){
//                System.out.println("Fizzbuzz");
//            } else if (i % 3 == 0){
//                System.out.println("Fizz");
//            } else if (i % 5 == 0){
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

//------------------------------------------------------------------------------
        //3 Display a table of powers.
        //Prompt the user to enter an integer.
        //Display a table of squares and cubes from 1 to the value entered.
        //Ask if the user wants to continue.
        //Assume that the user will enter valid data.
        //Only continue if the user agrees to:

//        What number would you like to go up to? 5
//
//        Here is your table!
//
//        number | squared | cubed
//        ------ | ------- | -----
//        1      | 1       | 1
//        2      | 4       | 8
//        3      | 9       | 27
//        4      | 16      | 64
//        5      | 25      | 125

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int lowInt = scanner.nextInt();
        System.out.println("Enter a larger integer: ");
        int highInt = scanner.nextInt();
        System.out.println("Would you like to continue? [y/n]");
        String confirm = scanner.next();

        if (confirm.equals("y")){
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");

            System.out.println("------ | ------- | -----");
        } else {
            System.out.println("okay then...");
        }



    }
}
