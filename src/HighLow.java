import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
//        System.out.println(adventureGame());
//    }
//
//    public static void hiLow(){
//        int randomNum = (int) Math.ceil(100 * java.lang.Math.random());
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Guess a number between 1 and 100: ");
//        int userInput = scanner.nextInt();
//
//        if(userInput < randomNum){
//            System.out.println("HIGHER: ");
//            userInput = scanner.nextInt();
//        } else if (userInput > randomNum){
//            System.out.println("LOWER: ");
//            userInput = scanner.nextInt();
//        } else {
//            System.out.println("GOOD GUESS!");
//        }


        //runthrough
//        int guess = 0;
//        int secret = (int) Math.round(Math.floor(Math.random() * 100 + 1));
//
//        System.out.println("guess what number im thinking of between 1 and 100: ");
//        guess = getInterger(1,100);
//        for (int guesses = 1; guesses <= 10 && guess != secret; guesses++){
//            if(guess < secret){
//                System.out.println("Higher");
//            } else if (guess > secret){
//                System.out.println("lower");
//                guess = getInteger(1, 100);
//            }
//        }
//        if (guess == secret) {
//            System.out.println("good guess, you win");
//        } else {
//            System.out.println("sorry, you're out of guesses");
//        }
//    }

//        public static void adventureGame(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Let's play a game! Are you ready to begin? [yes/no]");
            String readyToPlay = scanner.next();
            if (readyToPlay.equalsIgnoreCase("yes")) {
                System.out.println("yay!");
                System.out.println("What is your name?");
                String playerName = scanner.next();

                System.out.println("Okay, " + playerName + ", are you a hero? Or are you a villain?");
                String heroVillain = scanner.next();
                    if(heroVillain.equalsIgnoreCase("hero")){
                        System.out.println("Let's begin, " + playerName + "...An evil magician has arrived in your small town. He is attempting to destroy the city and kill the elders.\nWill you attempt to save the elders? Or will you run?\n");
                    } else {
                        System.out.println("Interesting choice...\nOkay, " + playerName + ", you are a dark magician and you have just arrived at the town of Ithaca.\nAn ancient oracle has predicted that the leader of Ithaca will be your downfall. Will you choose to destroy the town? \n1: Destroy the town with fireballs.\n2: Find and kill the elders with death spells.");
                        int destroyKill = scanner.nextInt();
                        if(destroyKill == 1){
                            System.out.println("You throw a few fireballs before a young farmer ");
                        }
                    }


            } else {
                System.out.println("aww, okay.");
            }
        }
    }
//}
