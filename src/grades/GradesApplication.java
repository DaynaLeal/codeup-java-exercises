package grades;
import util.Input;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student dayna = new Student("Dayna");
        dayna.addGrade(100);
        dayna.addGrade(97);
        dayna.addGrade(95);
        Student bri = new Student("Briana");
        bri.addGrade(90);
        bri.addGrade(97);
        bri.addGrade(100);
        Student chris = new Student("Chris");
        chris.addGrade(100);
        chris.addGrade(95);
        chris.addGrade(96);

        HashMap<String, Student> students = new HashMap<>();
        students.put("DaynaL", dayna);
        students.put("BriVN", bri);
        students.put("ChrisC", chris);



            System.out.println("Welcome!\n" +
                    "\n" +
                    "Here are the GitHub usernames of our students:\n");
            System.out.println(students.keySet());

            Input input = new Input();

            do {
                System.out.println(
                        "\nWhat student would you like to see more information on?\n" +
                        "\n" +
                        "DaynaL\n" +
                        "BriVN\n" +
                        "ChrisC\n");
                String userChoice = scanner.nextLine();

                if(students.containsKey(userChoice)){
                    getStudentInfo(userChoice, students);
                } else {
                    System.out.println("Sorry, no student was found with the entered username.\n");
                }
            } while(input.yesNo("Would you like to view information about another student? [y/n]\n"));

            System.out.println("Goodbye, and have a wonderful day!");
    }

    public static void getStudentInfo(String userChoice, HashMap<String, Student> students){
        System.out.println("Student Name: " + students.get(userChoice).getName());
        System.out.println("Grades: " + students.get(userChoice).getGrades());
        System.out.println("Grade Average: " + students.get(userChoice).getGradeAverage() + "\n");
    }

}
