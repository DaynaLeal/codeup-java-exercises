import java.util.Date;
//pull from cars.java for another example from lecture

public class Student {
    static int numberOfStudents = 0; //no this. in a static constructor
    String name;
    String cohort;
    private Date startDate; //cannot be accessed from another class but can be used in this class!!
    String program;
    String location;
    boolean drinksCoffee;

    public static void main(String[] args) {
        Student daniel = new Student("Daniel");
//        daniel.name = "Daniel";
        daniel.drinksCoffee = true;
        daniel.location = "San Antonio";
        daniel.cohort = "Europa";
        daniel.program = "web development";
        daniel.startDate = new Date(); //Date(); //calls date for today

        Student zach = new Student("Zach");
//        zach.name = "Zach";
        zach.drinksCoffee = true;

        Student dayna = new Student("Dayna");

        System.out.printf("there are now %d students.\n", numberOfStudents);

        Student briana = new Student("Briana"); //not added to number of students because created after student call

        System.out.println(daniel.name);
        if(zach.drinksCoffee){
            System.out.println(zach.name + " drinks coffee.");
        }

        System.out.println(daniel.report());

    }

    public String report() {
        String output = "";
        output += "My name is " + this.name + ". ";
        output += "I started learning " + this.program + " on " + this.startDate + " in the " + this.cohort
                + " cohort in " + this.location + ".";
        if (this.drinksCoffee) {
            output += " I drink coffee.";
        }
        return output;
    }

    public Student(String name){ //now the null constructors above dont work because we have given it a parameter. now we can comment out the names above and pass them into the constructor
        numberOfStudents++; //adds to number of students anytime a student is added
        this.name = name;
    }
}
