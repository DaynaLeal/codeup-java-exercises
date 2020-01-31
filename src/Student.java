import java.util.Date;

public class Student {
    String name;
    String cohort;
    Date startDate;
    String program;
    String location;
    boolean drinksCoffee;

    public static void main(String[] args) {
        Student daniel = new Student();
        daniel.name = "Daneil";
        daniel.drinksCoffee = true;
        daniel.location = "San Antonio";
        daniel.cohort = "Europa";
        daniel.program = "web development";
        daniel.startDate = new Date(); //Date(); //calls date for today

        Student zach = new Student();
        zach.name = "Zach";
        zach.drinksCoffee = true;

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
}
