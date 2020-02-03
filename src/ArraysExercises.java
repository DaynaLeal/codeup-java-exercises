import java.util.Arrays;

//import static java.util.Arrays.fill;

public class ArraysExercises {

    public static void main(String[] args){
        //exercise 1:
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers); //prints out memory location
        System.out.println(Arrays.toString(numbers)); //necessary to print out actual array

//        Person[] people = new Person[3]; //how to declare array and array length
        Person dayna = new Person("Dayna");
        Person bri = new Person("Briana");
        Person chris = new Person("Chris");
        Person charlie = new Person("Charlie");

        Person[] people = {dayna, bri, chris};
//        Arrays.fill(people, "Dayna");
//        System.out.println(dayna.getName());
        for (int i = 0; i < people.length; i++){
            System.out.println(people[i].getName());
        }

        addPerson(people, charlie);
        //---------------------------------------------------------------------------
        //exercise 2: server name generator
    }

    //exercise 1:
    public static void addPerson(Person[] people, Person name){
        Person[] personCopyArray = Arrays.copyOf(people, 4);
        personCopyArray[3] = name;
        for (int i = 0; i < personCopyArray.length; i++){
            System.out.println(personCopyArray[i].getName());
        }
//        return personCopyArray;
    }
    //---------------------------------------------------------------------------
    //exercise 2: Server name generator
}
