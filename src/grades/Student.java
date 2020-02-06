package grades;
import java.util.ArrayList;

public class Student {

    public static void main(String[] args){
        Student dayna = new Student("Dayna");
        dayna.addGrade(100);
        dayna.addGrade(90);
        dayna.addGrade(95);
        dayna.addGrade(97);
        dayna.addGrade(95);
        System.out.println(dayna.getGradeAverage()); //95.4
        System.out.println(dayna.getName());
    }

    private String name;
    private ArrayList<Integer> grades;

    //constructor
    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName(){
        return this.name;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    }
    //returns the student grades
    public ArrayList<Integer> getGrades(){
        return this.grades;
    }
    // returns the average of the students grades
    public double getGradeAverage(){
        double gradeSize = grades.size();
        double sum = 0;
        for(double grade : grades){
            sum += grade;
        }
        return (sum / gradeSize);
    }
}
