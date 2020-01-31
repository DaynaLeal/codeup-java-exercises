public class Person {
    private String name;

    public static void main(String[] args) {
        Person dayna = new Person("Dayna");
        System.out.println(dayna.getName());
        dayna.sayHello();
//        dayna.setName("Revae");
//        dayna.sayHello(); //now returns "Hello, Revae!"

        //exercise 2
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName())); //true
//        System.out.println(person1 == person2); //false

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2); //true

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName()); //john
//        System.out.println(person2.getName()); //john
//        person2.setName("Jane");
//        System.out.println(person1.getName()); //jane
//        System.out.println(person2.getName()); //jane
    }

    //exercise 1
    //constructor that creates person
    public Person(String name) {
        this.name = name;
    }
    //changes persons name
    public void setName(String name) {
        this.name = name;
    }
    //returns persons name
    public String getName(){
        return this.name;
    }
    //adds greeting using name
    public void sayHello(){
        System.out.println("Hello, " + this.name + "!\n");
    }
}
